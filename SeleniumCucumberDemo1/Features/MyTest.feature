Feature: Reset functionality on login page of Application

  Scenario: Verification of Reset button
    Given Open the Firefox and launch the application
    When Enter the Username and Password
    Then Reset the credential

  Scenario: Verification of Home Page of SwagLabs
    Given Open the Chrome and launch the Swaglabs App
    When Enter the valid Username
    And Enter the valid Password
    And click Login Button
    Then verify Products Page and user able to login successfully
    And Click Logout Button
