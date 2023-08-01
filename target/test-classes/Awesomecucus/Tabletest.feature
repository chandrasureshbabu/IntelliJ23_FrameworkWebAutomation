Feature: This is feature for cucumber expressions
  @sc1
  Scenario Outline: this is for cucumber expression and parameters
    Given on Cucumber doc page
    When i search for "<cucumber_expression>" on the page
    And i search for "<Regular_expressions>" on the doc page
    Then result are "<cucumber_expression>" vs "<Regular_expressions>"
    And i see results displaying 1 logo on logo page
    And i see results displaying 1.5 bird on logo page
    Examples:
    |cucumber expression| Regular expressions|
    |suresh             |babu                |


  @sc1
 Scenario Outline: This is to demo the Filing issue in bugzilla
   Given on the Bugzilla homepage
   When Clicks on login link
   Then username password fields appearon the page
   Then Enter valid creds "<Username>" and "<password>"
   And Click on login button
   Then should be able login
   Examples:
   |Username                |password |
   |chandra_nemani@gmail.com|Password1|

  @sc1
  Scenario Outline: This isto demo the Filing bug
    Given usr on the welcome page
    When Click new link
    Then Select "<Description>"
    And Enter Bug "<Severity>"
    Then Click Submit Bug button
    Examples:
    |Severity|Description|
    |major   |bug1       |
