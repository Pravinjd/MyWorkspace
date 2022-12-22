Feature: New Account


@sanity
Scenario: New Account

Given User Launch Chrome Browser
When Usee opens URL "https://demo.guru99.com/V4/index.php" 
And user enters UserID as "mngr318118" and Pasword as "Gpriya123@"
And clicks on Login
Then Page title should be "Guru99 Bank Manager HomePage"
When user click New Account menu
Then user can see Text "Add new account form"
And user enters customer ID
And Select Account type
And Enters intial deopsit
And user click on submit button
Then user can see Text "Account Generated Successfully!!!"