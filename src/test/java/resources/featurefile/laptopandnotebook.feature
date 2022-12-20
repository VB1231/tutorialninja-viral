@LaptopAndNotebook
Feature: LaptopAndNoteBook Test
@smoke @regression
  Scenario: verifyProductsPriceDisplayHighToLowSuccessfully
    Given I am on Homepage for laptop and notebook page
    When I select laptop and notebook page
    Then I navigate to laptop and note book page from homepage
 @sanity @regression
  Scenario:verifyThatUserPlaceOrderSuccessfully
    Given I am on Homepage for laptop and notebook page
   When I select currency change
    And I select laptop and notebook page
    And I select price high to low
    And I click on mac book
    And I verify mac book is there
    And I click on add to cart
    And I verify mac book added successfully
   And I click on shopping cart into success message
   And I verify in shopping cart mac book
    And I change quantity
    And I verify shopping cart modified
    And I verify total price for mac book
    And I click on check out
    And I verify check out is there
    And I verify is new customer
    And I select as guest check out
    Then I register all mandatory field

