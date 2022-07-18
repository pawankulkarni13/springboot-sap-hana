package com.stark.springbootrest;

import com.stark.springbootrest.domain.User;
import com.stark.springbootrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.stark.springbootrest.*")
@SpringBootApplication
public class SpringbootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("Hello World from Application Runner");
		User user = new User();
		user.setName("Pawan");
		user.setEmailAddress("pawan@sap.com");

		userRepository.save(user);
		System.out.println("Saved User Demo Pawan");
	}

}
