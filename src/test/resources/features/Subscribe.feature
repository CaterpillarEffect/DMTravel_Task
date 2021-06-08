Feature: Subscribe

  @mailTravel
  Scenario: User subscribes
    Given user is on the homepage
    Then user clicks on subscribe button
    And user signs up with dummy user information
    Then user verifies that he is on confirmation page

