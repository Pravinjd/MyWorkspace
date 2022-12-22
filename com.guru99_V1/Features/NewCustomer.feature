Feature: NewCustomer



Scenario: Add new Customer

Given User Launch Chrome Browser
When Usee opens URL "https://demo.guru99.com/V4/index.php" 
And user enters UserID as "mngr318118" and Pasword as "Gpriya123@"
And clicks on Login
Then Page title should be "Guru99 Bank Manager HomePage"
When user click on New Customer menu
Then user can view Add new Customer Page
When user enter customer info
And user click on submit button
Then Page title should be "Guru99 Bank Customer Registration Page"
And close Browser


