Feature: Login functionality on swagLabs1 Application with Data Driven Features

  Scenario Outline: Verification of Home Page of SwagLabs
    Given Open the Chrome and launch the Swaglabs App
    When Enter the valid username"<Username>"
    And Enter the valid password"<Password>"
    And click Login Button
    Then verify Products Page and user able to login successfully
    And Click Logout Button

    Examples: 
      | Username      | Password     |
      | srini         |        23232 |
      | vaasu         |        23232 |
      | jeevan        |        23232 |
      | Alex          |        23232 |
      | Mohd          |        23232 |
      | standard_user | secret_sauce |
