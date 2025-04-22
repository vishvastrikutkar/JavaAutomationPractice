Feature: Sign In/Sign Out

  Background: Home page
    Given User navigate to home page
    Then Verify home page opened

  Scenario: Successful sign in to existing account
    Given User navigate to Sign in page
    Then User should see the sign in page
    When User enter valid credentials
      | UserName | vishvas.trikutkar@gmail.com |
      | Password | password123 |
    And User submit the sign in form
    Then User should see my account page
    When User sign out
    Then User should see the sign in page

  Scenario: Sign with non existing account
    Given User navigate to Sign in page
    Then User should see the sign in page
    When User enter valid credentials
      | UserName | vishvas3434.trikutkar@gmail.com |
      | Password | password123 |
    And User submit the sign in form
    And User fails to sign in with error "Authentication failed."


