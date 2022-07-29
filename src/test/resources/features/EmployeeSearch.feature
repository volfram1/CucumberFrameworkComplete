Feature: US-12345 Employee Search in HRMS

  Background:
    //Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on admin button
    And user navigates to employee list page

  @regression
  Scenario: Search an employee by ID

    When user enters valid employee ID
    And user clicks on search button
    Then user is able to see employee information

    @smoke
  Scenario: Search an employee by name

    When user enters valid employee name
    And user clicks on search button
    Then user is able to see employee information


