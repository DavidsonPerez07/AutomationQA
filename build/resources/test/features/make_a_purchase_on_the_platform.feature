#Author: Davidson Perez
  #Language: en

  Feature: Make a purchase on the Automation Exercise page
    As I logged user I want to make a purchase to see all purchase process

    Scenario: Successful purchase
      Given I am in the main Automation Exercise main page
      When I log in
      And I select the product
      And I proceed with payment
      Then I can see a message that says "ORDER PLACED!"
      And I can download my invoice

    Scenario: Login with wrong email or password
      Given I am in the Automation Exercise main page
      When I go to login page
      And I put incorrect credentials
      Then I can see a message that says "Your email or password is incorrect!"
