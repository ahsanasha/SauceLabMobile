Feature: Buy product
  As a user I want to able to add product to the basket cart,
  So I can check out that products easily

  Background:
    Given User is already on the home page

  @buyProduct
  Scenario: Add product to the cart
    When User click add to cart
    Then Product will be added to the cart

