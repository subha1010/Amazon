Feature:  Amazon application login functionality testing
Scenario:  Login the application with valid username and password


Given User should be in Amazon Home Page
When User mousehover to Hello_SignIn button in the header
And User click on SignIn button in AJAX call
And User enter the email/mobile number in the email id field
And User click on continue button
And User enter the password in the password field
And User enter the SignIn button to login the application

Then User validate the username in the header





