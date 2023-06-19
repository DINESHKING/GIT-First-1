Feature: Validation of login page in AdactinHotelApp WebApplication
Scenario: TC01_Validation of login page with valid credentials
Given User is on login page
When User enters valid username and password
And User clicks on Login Button
Then User verifies home page is displayed
When User Selects the location of Hotel
When User Selects the Hotels Name
When User Selects the RoomType
When User Selects the Number of Rooms
When User Selects the CheckIn Date
When User Selects the CheckOut Date
When User Selects the Adults Per Room
When User Selects the Childrens Per Room
And User clicks on Search Button
When User click on Radio Button To Select The Hotel
And User clicks on Continue Button
When User Enters First Name
When User Enters Last Name
When User Enters Billing Address
When User Enters Valid Credit Card Number
When User Selects Credit Card Type
When User Selects Expiry Date
When User Enters CVV Number
And User Clicks on Book Now Button
When User Gets The Order ID
