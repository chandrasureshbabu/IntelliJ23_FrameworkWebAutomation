@HK
Feature: This is to demo the hooks Concept

@scenario1
Scenario Outline: This isto demo the Hooks Concept scenario-1
Given usr on the welcome page
When Click new link
Then Select "<Description>"
And Enter Bug "<Severity>"
Then Click Submit Bug button
Examples:
|Severity|Description|
|ciritcal |HooksTest |
|major    |HooksTest1|

@scenario2
  Scenario Outline: This isto demo the Hooks Concept scenario-2
    Given usr on the welcome page
    When Click new link
    Then Select "<Description>"
    And Enter Bug "<Severity>"
    Then Click Submit Bug button
    Examples:
      |Severity|Description|
      |Severe  |HooksTest |


  @scenario3
  Scenario Outline: This isto demo the Hooks Concept scenario-3
    Given usr on the welcome page
    When Click new link
    Then Select "<Description>"
    And Enter Bug "<Severity>"
    Then Click Submit Bug button
    Examples:
      |Severity|Description|
      |minor   |HooksTest1|

  @BFAF
  Scenario Outline: This isto demo the BeforeStep and AfterSteps Hooks Concept scenario-4
    Given usr on the welcome page
    When Click new link
    Then Select "<Description>"
    And Enter Bug "<Severity>"
    Then Click Submit Bug button
    Examples:
      |Severity|Description|
      |Major   |HooksTest4|

