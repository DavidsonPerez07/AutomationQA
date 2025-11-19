#Author: Davidson Perez
  #Language: en

  Feature: Make a purchase on the Automation Exercise page
    As I logged user I want to make a purchase to see all purchase process

    Scenario: Successful purchase
      Given I am in the main Automation Exercise main page
      When I click on the Sing up Login button
      And I fill out the Login to your account fields with a correct email and password
      And I click on the Login button
      And I am redirected to the main page
      And I click on View Product button of a product
      And I am redirected to the product details
      And I select the quantity of the product for purchase
      And I can see a modal that says "Added!"
      And I click on View Cart button on the modal
      And I am redirected to view cart page
      And I click on Proceed To Checkout button
      And I am redirected to the checkout page
      And I write a comment about my order
      And I click on the Place Order button
      Then I am redirected to the payment page
