@myaccount
Feature:MyAccount Test
  As user I want to login into Tutorial ninja website

  @smoke @regression
  Scenario:verifyUserShouldNavigateToRegisterPageSuccessfully
    Given I am on home page for account
    When I click on my account from homepage "Register"
    Then I navigate to my account page

  @sanity @regression
  Scenario: verifyThatUserRegisterAccountSuccessfully
    Given I am on home page for account
    When I click on my account from homepage "Register"
    And I fill all register field
    And I verify account created
    And I click on continue account
    And I click on my account from homepage "Logout"
    And I verify logout
    Then I click on continue

  @regression
  Scenario: verifyThatUserShouldLoginAndLogoutSuccessfully
    Given I am on home page for account
    When I click on my account from homepage "Login"
    And I enter email and password
    And I verify my account
    And I click on Logout
    And I verify account log out
    Then I click on continue after log out
