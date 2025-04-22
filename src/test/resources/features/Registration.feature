Feature: Registration Feature

  Background: Home page
    Given User navigate to home page
    Then Verify home page opened

  Scenario: Successful registration
    Given User navigate to Sign in page
    When User enter valid email address to Create New Account
    And User enter valid details
    | Title | Mr |
    | FirstName | Vishvas |
    | Lastname | Trikutkar |
    | Password | password123|
    And User submit the registration form
    Then User should see a confirmation message
    When User sign out
    Then User should see the sign in page

  Scenario: Registration with existing account email ID
    Given User navigate to Sign in page
    When User enter existing email address "vishvas.trikutkar@gmail.com" to Create New Account
    Then User gets existing account error "An account using this email address has already been registered. Please enter a valid password or request a new one."
