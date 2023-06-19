Feature: Validation of login page in facebook WebApplication
Scenario: TC01_Validation of login page with valid credentials
Given User is on login page
When User enters valid username and password
And User clicks on Login Button
Then User verifies home page is displayed
