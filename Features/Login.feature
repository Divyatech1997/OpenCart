Feature: Login


  Scenario: Login functionality with valid credentials
    When Enter valid username "Admin"
    And Enter valid password "admin123"
    And Click login field
    Then User can able to go to "Dashboard" page




    Scenario Outline: Login functionality with data-driven
      When Enter valid username "<user>"
      And Enter valid password "<password>"
      And Click login field
      Then User can able to go to "Dashboard" page




      Examples:
        | user  | password  |
        | Admin | admin123  |
        | Divya | Divya@123 |
