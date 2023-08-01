@Cus
Feature:  this is to demo Custom parameter
  Scenario Outline:  this is to demo the custom parameter
    Given user is on the Bugzilla hompage
    Then  User provides Valid "<Username>"
    And provide valid Password
    Examples:
      |Username                |
      |Suresh Custom Parameter |

