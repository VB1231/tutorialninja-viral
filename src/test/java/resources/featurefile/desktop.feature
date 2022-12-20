@Desktop
Feature: Desktop Test
  As user I want to login into Tutorial ninja website
@smoke @regression
  Scenario:verifyProductArrangeInAlphaBaticalOrder
    Given I am on homepage of desktop
    When I click on desktop page
    Then I navigate to alphabetical order
@sanity @regression
  Scenario: verifyProductAddedToShoppingCartSuccessFully
    Given I am on homepage of desktop
    When I select desktop using show all menu
    And  I verify hp is selected
    And I set date
    And I click on Add to cart for hp
    And I verify hp is added to cart
    And I click on Add to cart link
    And I verify item added to shopping cart
    And I verify model of hp
    And I verify delivery date
    And I verify product numbers
    Then I verify total price
