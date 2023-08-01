@FW1
Feature: Create a bug as admin User Admin User

@T3
  Scenario: Login as Admin user
    Given User navigated Bugzilla Homepage
    When  Clicks LoginLink
    Then  Username Field  and password Fields are Displayed
    Then  User Enters valid Admin Username "chandra_nemani@hotmail.com" and Password "Password1"
    Then  Admin User is on Welcomepage

  @T4
  Scenario: Admin user create Bug

    Given User navigated Bugzilla Homepage
    When  Clicks LoginLink
    Then  Username Field  and password Fields are Displayed
    Then  User Enters valid Admin Username "chandra_nemani@hotmail.com" and Password "Password1"
    Then  Admin User is on Welcomepage
    Then   Clicks New on welcomePage
    Then   user is on Bugzilla_enterBug page
    Then   user enters bugDetails
  |Severity|Hardware|Os     |ShortDesc  |Description|
  |critical|Other   |Windows|Bug Short2 |Bug Desc   |
    And    Submit bug

@T5
  Scenario: Admin user Login_  ex for context shared b/w Steps  using variables but its not recommended
    Given User navigated Bugzilla Homepage
    And  Admin user credentails are
    |Username                  |Password |
    |chandra_nemani@hotmail.com|Password1|
    When  Clicks LoginLink
    Then Provide Admin Creds
    And Click Login
    Then  Admin User is on Welcomepage
@T6
  Scenario: Admin user Login and Create a bug_  ex for context shared b/w Steps  using datatable and domain objects

    Given User navigated Bugzilla Homepage
    And Admin user creds are
      |Username                  |Password |
      |chandra_nemani@hotmail.com|Password1|
    When  Clicks LoginLink
    Then Enter Admin Creds
    And Click Login
    Then Admin User is on Welcomepage
    Then Clicks New on welcomePage
    Then user is on Bugzilla_enterBug page
    Then provide BugDetails
      |Severity|Hardware|Os     |ShortDesc      |Description   |
      |critical|Other   |Windows|RunTime Error2 |RunTime Error2|
    And  Submit bug

@T7
  Scenario: bug Search from Welcome Page
    Given User navigated Bugzilla Homepage
    When  Clicks LoginLink
    Then  Username Field  and password Fields are Displayed
    Then  User Enters valid Admin Username "chandra_nemani@hotmail.com" and Password "Password1"
    Then  Admin User is on Welcomepage
    And   Search a bug "RunTime Error"
    Then Admin user should see a Bugname "RunTime Error"

  @T8
  Scenario Outline: bug Search from Welcome Page_scemario outline
    Given User navigated Bugzilla Homepage
    When  Clicks LoginLink
    Then  Username Field  and password Fields are Displayed
    Then  User Enters valid Admin Username "chandra_nemani@hotmail.com" and Password "Password1"
    Then  Admin User is on Welcomepage
    And   Search a bug "<Bug Desc>"
    Then Admin user should see a Bugname "<Bug Desc>"
    Examples:
      | Bug Desc     |
      | RunTime Error|
      |RunTime Error2|