Feature: Leaftaps login
#Background is keyword in Gherkin it execute before running the each scenario
#Background: 
#Given Set the test environment

@Regression
Scenario: Leaftaps login scenario with valid test data

#Given Set the test environment
Given Enter the username as 'democsr' and Enter the password as 'crmsfa'
When Click on the login button
Then Verify the login is successfull
