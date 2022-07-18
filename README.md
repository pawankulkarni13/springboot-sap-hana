This is the basic demo to run a sample SB app in SAP Cloud CF Env with SAP Hana Cloud connectivity.

    Disclaimer - All the credentials/accounts used are on Trial Accounts and are not linked with any enterprise nor any employee account

Useful commands 
cf8 push

If these commands are not run - binding wont happen. 
Ensure you either bind through cf cli or through SAP Cloud CF UI.

cf8 csk hanadbtest hanaKey
cf8 service-key hanadbtest hanaKey -- get key

Configs like
vcap.services.hanadbtest.credentials.url 
can be added in user defined variable under SAP Cloud Cockpit UI

Screenshots refer to old name of the project. :) 

Unused code/dependencies can be clean as future activity.
