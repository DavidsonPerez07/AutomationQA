#Author: Davidson Perez
  #Language: en

Feature: Register on the Automation Exercise page
  As I user I want to register on the Automation Exercise page to have a user account

  Scenario: Register new user on the Automation Exercise page with not registered email
    Given I am in the main Automation Exercise main page
    When I enter to Sing up Login page
    And I fill out the New User Sing up fields with a not registered email
    And I complete the rest of the sing up fields
    Then I can view a message that says "ACCOUNT CREATED!"

  Scenario: Register new user on the Automation Exercise page with a registered email
    Given I am in the main Automation Exercise main page
    When I enter to Sing up Login page
    And I fill out the New User Sing up fields with a registered email
    Then I can view a message that says "Email Address already exist!"
