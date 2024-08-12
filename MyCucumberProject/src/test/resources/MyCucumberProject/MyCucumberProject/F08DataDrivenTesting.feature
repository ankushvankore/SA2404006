Feature: Orange HRM Login

  Scenario Outline: Validate Login functionality
    Given Open "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When I Enter "<UserName>" and "<Password>"
    And I Click on Submit button
    Then Dashboard page should display

    Examples: 
      | UserName | Password   |
      | admin    | admin123   |
      | bhup     | bhup123    |
      | admin    | admin123   |
      | mythili  | mythili123 |
