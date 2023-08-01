@Fmw
Feature: This feature to Test HomePage Funcationalties

@T1
  Scenario: Home page
    Given user is navigated to home page of bugizlla
    Then user should be able to Log in Link
    And user should be able to see Forgotpassword link
  @T2
    Scenario: Login to Bugzilla with valid Creds
      Given user is navigated to home page of bugizlla
      And user should be able to Log in Link
      Then click Login Link
      Then user should be able to see username and password fields
      And user should be able to see Login button
      Then Enter Username "chandra_nemani@hotmail.com" and Password "Password1" and Click Login
      Then Click New on WelcomePage
      Then App Redirected to BugPage
      Then Enter BugDetails
      |Severity|Hardware|Os     |ShortDesc  |Description|
      |critical|Other   |Windows|Bug Short2 |Bug Desc   |
