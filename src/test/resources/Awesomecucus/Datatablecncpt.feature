
@DT
Feature: this is demo Datatable Concept
  @DT-1
  Scenario: This is to Demo Datatable Concept exp1 -with out header
    Given user1 is on homepage
    Then Provide valid username and password
    |suresh|password1|
    @DT-2
  Scenario: This is to Demo Datatable Concept exp2 -Multiple rows with out header
    Given user1 is on homepage
    Then Provide valid username and password of user2
      |suresh|password1|
      |chandra|password2|

    @DT-3
  Scenario: This is to Demo Datatable Concept exp3 -Single row with out header with Custom Datatable object
    Given user1 is on homepage
    Then Provide valid username and password of user3
      |suresh|password1|


    @DT-4
    Scenario: This is to Demo Datatable Concept exp4 -Multiple rows with out header with Custom Datatable object
      Given user1 is on homepage
      Then Provide valid username and password of user4
        |suresh|password1|
        |chandra|password2|
    @DT-5
  Scenario: This is to Demo Datatable Concept exp5 -single rows with  header with Custom Datatable object
    Given user1 is on homepage
    Then Provide valid username and password of user5
      |Username|Password|
      |chandra|password2|

    @DT-6
   Scenario: This is to Demo Datatable Concept exp6 -Multiple rows with  header with Custom Datatable object
      Given user1 is on homepage
      Then Provide valid username and password of user6
        |Username|Password|
        |suresh|password1|
        |chandra|password2|

    @DT-7
  Scenario: This is to Demo Datatable Concept exp7 -single rows with  header with Custom Datatable object using maps
    Given user1 is on homepage
    Then Provide valid username and password of user7
      |Username|Password|
      |suresh7|password7|

    @DT-8
  Scenario: This is to Demo Datatable Concept exp8 -Multiple rows with  header with Custom Datatable object using maps
    Given user1 is on homepage
    Then Provide valid username and password of user8
      |Username|Password|
      |suresh|password1|
      |chandra|password2|

    @DT-9
    Scenario: This is to Demo Datatable Concept exp9 -Single column with no header with Custom Datatable object using maps
      Given user1 is on homepage
      Then Provide valid username and password of user9
        |suresh   |
        |password1|

    @DT-10
    Scenario: This is to Demo Datatable Concept exp10 -Single column with no header with Custom Datatable object using maps and datatable
      Given user1 is on homepage
      Then Provide valid username and password of user10
        |suresh   |
        |password1|

    @DT-11
    Scenario: This is to Demo Datatable Concept exp11 -Single column with  header with Custom Datatable object using maps and datatable
      Given user1 is on homepage
      Then Provide valid username and password of user11
        |Username|suresh   |
        |Password|password1|

    @DT-12
    Scenario: This is to Demo Datatable Concept exp12 -Single column with  header with Custom Datatable object using maps
      Given user1 is on homepage
      Then Provide valid username and password of user12
        |Username|suresh12  |
        |Password|password12|
    @DT-13
    Scenario: This is to Demo Datatable Concept exp13-Single column with no header with Custom Datatable object And Transpose
      Given user1 is on homepage
      Then Provide valid username and password of user13
        |Usernam13  |
        |password13|
  @DT-14
  Scenario: This is to Demo Datatable Concept exp14-Single column with  header with Custom object And Transpose
    Given user1 is on homepage
    Then Provide valid username and password of user14
      |Username|suresh14   |
      |Password|password14|










