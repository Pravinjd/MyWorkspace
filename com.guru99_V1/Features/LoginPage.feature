Feature: Login


Scenario: Successful login with valid credentials

Given User Launch Chrome Browser
When Usee opens URL "https://demo.guru99.com/V4/index.php" 
And user enters UserID as "mngr318118" and Pasword as "Gpriya123@"
And clicks on Login
Then Page title should be "Guru99 Bank Manager HomePage"
When user clicks on Logout link
And accepts alert
Then Page title should be "Guru99 Bank Home Page"
And close Browser
