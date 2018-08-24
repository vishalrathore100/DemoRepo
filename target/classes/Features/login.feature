Feature: Free CRM Test

  Scenario: Free CRM Login Test
    Given user is on Free CRM
    When user is on Login Page
    Then user enter username and password
    |username|password|
    |vrathore|test@123|
    |wewilltest|WEAREGOPO|
    Then user clicks login button
    Then user is on Home page
    

    
