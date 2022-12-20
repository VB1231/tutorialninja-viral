package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.DesktopPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class DesktopSteps {
    @Given("^I am on homepage of desktop$")
    public void iAmOnHomepageOfDesktop() {

    }

    @When("^I click on desktop page$")
    public void iClickOnDesktopPage() {
        new DesktopPage().selectDesktopPage();
    }

    @Then("^I navigate to alphabetical order$")
    public void iNavigateToAlphabeticalOrder() {
     Assert.assertEquals("not verify",new DesktopPage().beforeSort(),new DesktopPage().afterSort());
    }

    @When("^I select desktop using show all menu$")
    public void iSelectDesktopUsingShowAllMenu() {
     new DesktopPage().showAllDesktops();
    }

    @And("^I verify hp is selected$")
    public void iVerifyHpIsSelected() {
       Assert.assertEquals("not verify",new DesktopPage().verifyTextHP(),"HP LP3065");
    }

    @And("^I set date$")
    public void iSetDate() {
        new DesktopPage().setDate();
    }

    @And("^I click on Add to cart for hp$")
    public void iClickOnAddToCartForHp() {
        new DesktopPage().clickOnAddToCart();
    }

    @And("^I verify hp is added to cart$")
    public void iVerifyHpIsAddedToCart() {
      Assert.assertEquals("not verify",new DesktopPage().verifyYouSuccessfullyAdded(),"Success: You have added HP LP3065 to your shopping cart!\n" +
                "×");
    }

    @And("^I click on Add to cart link$")
    public void iClickOnAddToCartLink() {
        new DesktopPage().clickOnAddToCartLink();
    }

    @And("^I verify item added to shopping cart$")
    public void iVerifyItemAddedToShoppingCart() {
       Assert.assertEquals("not verify",new DesktopPage().verifyTextShoppingCart(),"Shopping Cart  (1.00kg)");
    }

    @And("^I verify model of hp$")
    public void iVerifyModelOfHp() {
        Assert.assertEquals("not verify",new DesktopPage().verifyTextHpL(),"HP LP3065");

    }

    @And("^I verify delivery date$")
    public void iVerifyDeliveryDate() {
       Assert.assertEquals("not verify",new DesktopPage().verifyDeliveryDate(),"Delivery Date: 2022-11-30");
    }

    @And("^I verify product numbers$")
    public void iVerifyProductNumbers() {
        Assert.assertEquals("not verify",new DesktopPage().verifyModel(),"Product 21");
    }

    @Then("^I verify total price$")
    public void iVerifyTotalPrice() {
       Assert.assertEquals("not verify",new DesktopPage().verifyTotalAmount(),"£74.73");
    }
}
