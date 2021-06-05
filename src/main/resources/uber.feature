@CODE-14301
Feature: Uber Booking feature

  @TC1 @Functional
  Scenario: Booking cab sedan
    Given User wants to select a car type from "sedan" from Uber App
    When user select car "sedan" and pick up point "Bangalore" and drop location is "Pune"
    Then driver starts the Journey
    And Driver ends the Journey
    Then User pays 10000 USD

  @Regression
  Scenario: Booking cab SUV
    Given User wants to select a car type from "SUV" from Uber App
    When user select car "SUV" and pick up point "Bangalore" and drop location is "Chennai"
    Then driver starts the Journey
    And Driver ends the Journey
    Then User pays 10000 USD

  @TC3 @Smoke
  Scenario: Booking cab Mini
    Given User wants to select a car type from "Mini" from Uber App
    When user select car "Mini" and pick up point "Bangalore" and drop location is "Mumbai"
    Then driver starts the Journey
    And Driver ends the Journey
    Then User pays 10000 USD
