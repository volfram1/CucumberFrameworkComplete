Feature: US-123 validation of login scenarios

  Background:
    //Given user is navigated to HRMS application

  @smoke
  Scenario: Admin login

    When user enters valid admin credentials
    And user clicks on admin button
    Then admin user is successfully logged in

    @regression
  Scenario: ESS login

    When user enters valid ESS credentials
    And user clicks on admin button
    Then ESS user is successfully logged in

  @regression
  Scenario: Invalid login

    When user enters invalid credentials
    And user clicks on admin button
    Then user sees error message on the screen



