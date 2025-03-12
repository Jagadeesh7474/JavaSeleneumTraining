Feature:


Scenario: To check login functinality of the Application
Given User opens the Browser
And User navigates to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" the webpage
When User enters the Login Credentials
|TestData123.xlsx|
And User Clicks login button
Then User checks the functionality of login
And User closes the browser
