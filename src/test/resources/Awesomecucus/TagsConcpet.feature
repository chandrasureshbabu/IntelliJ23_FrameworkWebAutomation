@FeatureLevelTag
Feature: This is to demo the tags Concept in cucumber

  @RuleLevel1
  Rule: login to file a issue in QA env

  @ScenarioLevel1
  Scenario Outline: This is to Demo the Tags Concept scenario-1
    Given User is on the Bugzilla Home Page
    When Clicks on the Login Page
    Then Provides Username "<Username>" and Password "<Password>"
    And Clicks login button

    @QA1-Datalevel
    Examples:
    |Username|Password|
    |suresh  |Password1|
    @QA2-Datalevel
    Examples:
    |Username|Password |
    |Chandra |Password2|

  @RuleLevel1
  Rule: login to file a issue in stage env

  @ScenarioLevel2
  Scenario Outline: This is to Demo the Tags Concept scenario-2
    Given User is on the Bugzilla Home Page
    When Clicks on the Login Page
    Then Provides Username "<Username>" and Password "<Password>"
    And Clicks login button

    @QA3-Datalevel
    Examples:
      |Username|Password|
      |nemani  |Password1|
    @QA4-Datalevel
    Examples:
      |Username|Password |
      |babu |Password2|


  @RuleLevel2
  Rule: login to file a issue in QA env

  @ScenarioLevel3
  Scenario Outline: This is to Demo the Tags Concept scenario-3
    Given User is on the Bugzilla Home Page
    When Clicks on the Login Page
    Then Provides Username "<Username>" and Password "<Password>"
    And Clicks login button

    @QA1-Datalevel
    Examples:
      |Username|Password|
      |suresh  |Password1|
    @QA2-Datalevel
    Examples:
      |Username|Password |
      |Chandra |Password2|

