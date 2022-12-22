Feature: Edit Customer



Scenario: edit Customer

Given User Launch Chrome Browser
When Usee opens URL "https://demo.guru99.com/V4/index.php" 
And user enters UserID as "mngr318118" and Pasword as "Gpriya123@"
And clicks on Login
Then Page title should be "Guru99 Bank Manager HomePage"
When user click on Edit Customer menu
Then user can view Edit Customer page
And user enters customer ID
And click on submit button
Then user can view Edit Customer Entry Page
And user click on submit button
And accepts alert
Then Page title should be "Guru99 Bank Edit Customer Page"