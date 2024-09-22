Feature: Leaftaps Lead

@CreateLead 
Scenario: Leaftaps create lead scenario with valid test data

#Given Set the test environment
And Enter the username as 'demosalesmanager'
And Enter the password as crmsfa
When Click on the login button
Then Verify the login is successfull
When Click on the crmsfa link
And Click on leads tab
And Click on the create lead link
Given Enter the company name as 'TestLeaf' 
And Enter the first name as 'Gokul'
And Enter the last name as 'Sekar'
When Click on the create lead button
Then Verify the lead is create successfull