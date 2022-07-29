
  Feature: Dashboard tabs verification functionality

    @dashboard
    Scenario: verify dashboard tabs
      When user enters valid admin credentials
      And user clicks on admin button
      Then admin user is successfully logged in
      Then user verifies all dashboard tabs
      |Admin|PIM|Leave|Time|Recruitment|Performance|Dashboard|Directory|