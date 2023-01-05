Feature: Login functionality on swagLabs Application with Data Driven Features

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully

    Examples: 
      | username   | password |
      | testuser_1 | Test@153 |
      | testuser_2 | Test@153 |
