package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class HomePageSteps {
    @Given("^I am on homepage for homepage$")
    public void iAmOnHomepageForHomepage() {
    }

    @When("^I click on desktop page from homepage$")
    public void iClickOnDesktopPageFromHomepage() {
        new DesktopPage().selectDesktopPage();
    }

    @Then("^I navigate to desktop page$")
    public void iNavigateToDesktopPage() {
      Assert.assertEquals("not verify",new DesktopPage().verifyDesktopNavigation(),"Desktops");
    }

    @When("^I click on laptop and notebook page from homepage$")
    public void iClickOnLaptopAndNotebookPageFromHomepage() {
        new LaptopsAndNoteBooksPage().selectLaptopAndNotebookPage();
    }

    @Then("^I navigate to laptop and note book page$")
    public void iNavigateToLaptopAndNoteBookPage() {
        Assert.assertEquals("not verify",new LaptopsAndNoteBooksPage().verifyLaptopsAndNotebooksText(),"Laptops & Notebooks");
    }

    @When("^I click on component page from homepage$")
    public void iClickOnComponentPageFromHomepage() {
        new HomePage().selectComponents();
    }

    @Then("^I navigate to component page$")
    public void iNavigateToComponentPage() {
        Assert.assertEquals("not verify",new HomePage().verifyTextComponents(),"Components");
    }
}
