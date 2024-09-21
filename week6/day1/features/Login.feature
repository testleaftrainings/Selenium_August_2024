Feature: Leaftaps login

Scenario: Leaftaps login scenario with valid test data

Given Set the test environment
And Enter the username as demosalesmanager
And Enter the password as crmsfa
When Click on the login button
Then Verify the login is successfull

Scenario: Leaftaps login scenario with invalid test data
Given Set the test environment
And Enter the username as demo
And Enter the password as crmsfa
When Click on the login button
But Verify the login is successfull