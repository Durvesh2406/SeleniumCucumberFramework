Feature: Login User

  Scenario: User is able to login with valid credentials
    Given User enters valid username in the username field
    And User enter valid password in the password field
    When User clicks on the login button
    Then User is logged in successfully

  Scenario: User is not able to login with invalid credentials
    Given User enters invalid username in the username field
    And User enter invalid password in the password field
    When User clicks on the login button
    Then User is not logged into the application
