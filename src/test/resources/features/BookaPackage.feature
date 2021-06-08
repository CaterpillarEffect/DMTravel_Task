@mailTravel
Feature: MailTravel

  Scenario: MailTravel Task
    Given user is on the homepage
    And user verifies Homepage Title
    And user searches "India"
    And user clicks More Info button of result 1
    Then user checks that the following information is displayed:
      | days  | 9      |
      | price | £1,335 |
    And "phoneNumber" is displayed
    When user clicks on Itinerary
    Then verifies all days of Itinerary display Information
    When user clicks on "Book Online" button
    Then user verifies the default date is selected
    And user clicks on "Continue" button
    When user clicks on "Transport" link
    Then user verifies that selected date is set as departure date and departure date+9 as the last date.
    When user clicks on "Accommodation" link
    And user enters the given data for standard room;
      | 1        |
      | 2 adults |
    And user clicks on "Select your room and continue"
    And user selects default value in Extras
    And user clicks on "Continue without extras"
    And user fills out dummy information in the Passenger Details
    Then user verifies that it is proceeding to payment page








