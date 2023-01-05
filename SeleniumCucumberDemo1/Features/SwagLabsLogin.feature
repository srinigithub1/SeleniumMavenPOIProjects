Feature: SwagLabs Login funcioanlity

  Scenario: check Login funtionality of SwagLabs
    Given Launch app in chrome Browswer
    And Home page should be opened
    When i Enter username
    And Enter passwrod
    And click login link
    Then I validate products page
    And click logout button
    And check HOme page
    And close App


