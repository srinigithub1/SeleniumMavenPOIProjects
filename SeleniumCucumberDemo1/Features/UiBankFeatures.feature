Feature: As a Enduser Login to UiBank Application
  I want to use this Feature to automate UibankApplicaiton

  @tag1
  Scenario: UiBank Login Functionality with correct username and Password
    Given I want to launch UiBank app in Chrome browser
    And Ensure Login page hasbeen displayed
    When As a End User valid Enter username in Uibank App
    And As a End User valid Enter Password in Uibank App
    And Click Login button in Uibank applicaiton
    Then Verify Account Summary page in UiBankApp
    And Verify Logout button in Uibank Ac Summary Page
    And close Browser

  Scenario: UiBank Login Functionality with incorrect username and Password
    Given I want to launch UiBank app in Chrome browser
    And Ensure Login page hasbeen displayed
    When As a End User invalid Enter username in Uibank App
    And As a End User invalid Enter Password in Uibank App
    And Click Login button in Uibank applicaiton
    Then Verify Error Mesage in UiBankApp
    And close Browser
    
  Scenario: UiBank Login Functionality with Empty values of username and Password
    Given I want to launch UiBank app in Chrome browser
    And Ensure Login page hasbeen displayed
    When As a End User invalid Enter Empty value of username in Uibank App
    And As a End User invalid Enter Empty value of Password in Uibank App
    And Click Login button in Uibank applicaiton
    Then Verify Error Mesage of LoginFailed in UiBankApp
    And close Browser