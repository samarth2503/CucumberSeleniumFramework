Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|samarthjain680@gmail.com|Sam@123|

Scenario: Account page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "My account - My Store" 

Scenario: Account section count
Given user is on Accounts page
Then user gets accounts section
|Order history and details|
|My credit slips|
|My Addresses|
|My personal information|
|My wishlists|
And accounts section count should be 5
