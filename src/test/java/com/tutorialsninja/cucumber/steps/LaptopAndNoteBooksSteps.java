package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import com.tutorialsninja.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;


public class LaptopAndNoteBooksSteps {
    @Given("^I am on Homepage for laptop and notebook page$")
    public void iAmOnHomepageForLaptopAndNotebookPage() {
    }

    @When("^I select laptop and notebook page$")
    public void iSelectLaptopAndNotebookPage() {
        new LaptopsAndNoteBooksPage().selectLaptopAndNotebookPage();
    }

    @Then("^I navigate to laptop and note book page from homepage$")
    public void iNavigateToLaptopAndNoteBookPageFromHomepage() {
        Assert.assertEquals("Not verify", new LaptopsAndNoteBooksPage().afterPriceSort(), new LaptopsAndNoteBooksPage().beforePriceSort());
    }

    @When("^I select currency change$")
    public void iSelectCurrencyChange() {
        new DesktopPage().currencyChange();
    }

    @And("^I select price high to low$")
    public void iSelectPriceHighToLow() {
        new LaptopsAndNoteBooksPage().selectPriceSortHighToLow();
    }

    @And("^I click on mac book$")
    public void iClickOnMacBook() {
        new LaptopsAndNoteBooksPage().clickOnMacBook();
    }

    @And("^I verify mac book is there$")
    public void iVerifyMacBookIsThere() {
        Assert.assertEquals("not verify", new LaptopsAndNoteBooksPage().verifyTextMacBook(), "MacBook");
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new LaptopsAndNoteBooksPage().clickOnAddToCart();
    }

    @And("^I verify mac book added successfully$")
    public void iVerifyMacBookAddedSuccessfully() {
        Assert.assertEquals("not verify", new LaptopsAndNoteBooksPage().verifySuccessFullyAddedToCart(), "Success: You have added MacBook to your shopping cart!\n" +
                "×");
    }

    @And("^I click on shopping cart into success message$")
    public void iClickOnShoppingCartIntoSuccessMessage() {
        new LaptopsAndNoteBooksPage().clickOnShoppingCartInToSuccessMessage();
    }

    @And("^I verify in shopping cart mac book$")
    public void iVerifyInShoppingCartMacBook() {
        Assert.assertEquals("not verify", new LaptopsAndNoteBooksPage().verifyTextMacBookInShopping(), "MacBook");
    }

    @And("^I change quantity$")
    public void iChangeQuantity() {
        new LaptopsAndNoteBooksPage().changeQty();
    }

    @And("^I verify shopping cart modified$")
    public void iVerifyShoppingCartModified() {
        Assert.assertEquals("not verify", new LaptopsAndNoteBooksPage().verifyUpdatedMessage(), "Success: You have modified your shopping cart!\n" +
                "×");
    }

    @And("^I verify total price for mac book$")
    public void iVerifyTotalPriceForMacBook() {
        Assert.assertEquals("not verify", new LaptopsAndNoteBooksPage().verifyTotalPrice(), "£737.45");
    }

    @And("^I click on check out$")
    public void iClickOnCheckOut() {
        new LaptopsAndNoteBooksPage().clickOnCheckOut();
    }

    @And("^I verify check out is there$")
    public void iVerifyCheckOutIsThere()throws StaleElementReferenceException {
        Assert.assertEquals("not verify", new LaptopsAndNoteBooksPage().verifyTextClickOnCheckOut(), "Checkout");
         }

    @And("^I verify is new customer$")
    public void iVerifyIsNewCustomer() {
        Assert.assertEquals("not verify", new LaptopsAndNoteBooksPage().verifyNewCustomer(), "New Customer");
    }

    @And("^I select as guest check out$")
    public void iSelectAsGuestCheckOut() {
        new LaptopsAndNoteBooksPage().selectGuestCheckOut();
    }

    @Then("^I register all mandatory field$")
    public void iRegisterAllMandatoryField() {
        new RegisterPage().mandatoryField();
    }
}
