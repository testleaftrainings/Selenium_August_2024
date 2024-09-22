Feature: Leaftaps Lead

@Smoke
Scenario Outline: Leaftaps create lead scenario with valid test data

#Given Set the test environment
And Enter the username as 'demosalesmanager'
And Enter the password as crmsfa
When Click on the login button
Then Verify the login is successfull
When Click on the crmsfa link
And Click on leads tab
And Click on the create lead link
Given Enter the company name as <company name> 
And Enter the first name as <first name>
And Enter the last name as <last name>
When Click on the create lead button
Then Verify the lead is create successfull

Examples:
|first name|last name|company name|
|Gokul|Sekar|TestLeaf|
|Babu|M|Qeagle|