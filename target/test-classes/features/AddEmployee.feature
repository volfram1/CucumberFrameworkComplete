Feature: Adding the employee to HRMS application

  Background:
    When user enters valid admin credentials
    And user clicks on admin button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

  @regression
  Scenario: adding an employee from feature file
    And user enters first name middle name and last name
    And user clicks on save button
    Then employee is added successfully


  Scenario: adding an employee using cucumber feature file
    And user enters "gunia" "agusia" "aga"
    And user clicks on save button
    Then employee is added successfully


    Scenario Outline: Adding multiple employees
      And user enters "<firstName>" "<middleName>" and "<lastName>"
      And user clicks on save button
      Then employee is added successfully
      Examples:
      |firstName|middleName|lastName|
      |Aga      |MS        |aga     |
      |Kinga    |anna      |Nowak   |
      |Jola     |Kasia     |Aneta   |

  @test
    Scenario: Add employee using data table
      When user provides multiple data and verify they are added
    |firstname|middleName|lastName|
    |Aga      |MS        |aga     |
    |Agusia   |anna      |kasia   |
    |jola     |kasia     |aneta   |

  @excel
  Scenario: adding multiple employees from excel file
    When user adds multiple employees from excel file using "employyeData" sheet and verified the user added









