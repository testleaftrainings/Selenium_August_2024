Feature: Leaftaps login
#Background is keyword in Gherkin it execute before running the each scenario
#Background: 
#Given Set the test environment

@Positive @Smoke
Scenario: Leaftaps login scenario with valid test data

#Given Set the test environment
And Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Verify the login is successfull

@Negative
Scenario: Leaftaps login scenario with invalid test data
#Given Set the test environment
And Enter the username as 'demo'
And Enter the password as crmsfa
When Click on the login button
But Verify the login is successfull