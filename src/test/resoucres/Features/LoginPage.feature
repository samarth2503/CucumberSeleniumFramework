Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forgot Password Link
Given user is on login page
Then forgot password link should be displayed

Scenario: Login with correct credentails
Given user is on login page
When user enters username "samarthjain680@gmail.com"
And users enters password "Sam@123"
And user clicks on Login button
Then user gets title of the home page
And page title should be "My account - My Store"