Feature: 
@sanity
Scenario: To check title of the Application
Given  User opens the Browser
And User navigates to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" the webpage
Then User verifies the title of web page
And User closes the browser
@regression
Scenario Outline: To check Login functionality of the application
Given  User opens the Browser
And User navigates to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" the webpage
When User Enters '<Username>' username
And User Enters '<Password>' password
And User Clicks login button
Then User checks the functionality of login
And User closes the browser
Examples:
|Username|Password|
|Admin|admin123|
|Admin|admin123|



