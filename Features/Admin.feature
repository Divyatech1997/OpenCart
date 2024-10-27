Feature: Admin

  Background: Open the application url and login into application
    When Login into application by entering valid username "Admin" and valid password "admin123"
    Then user can able to login and go to "Dashboard" page


  Scenario: Search employee name
    When click admin module
    Then user can able to go to "Admin" page
    When Enter system user details username "manojkumar"
    And User role "ESS"
    And Employee name "manda user"
    And Status "Disabled"
    And click Search button
    Then Employee name "manda user" should show in Record


