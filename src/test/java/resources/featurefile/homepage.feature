@Homepage
Feature: Homepage Test
  As user I want to login into Tutorial ninja website

  @smoke @regression
  Scenario:verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on homepage for homepage
    When I click on desktop page from homepage
    Then I navigate to desktop page

  @sanity @regression
  Scenario:verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
    Given I am on homepage for homepage
    When I click on laptop and notebook page from homepage
    Then I navigate to laptop and note book page

  @regression
  Scenario:verifyUserShouldNavigateToComponentsPageSuccessfully
    Given I am on homepage for homepage
    When I click on component page from homepage
    Then I navigate to component page
