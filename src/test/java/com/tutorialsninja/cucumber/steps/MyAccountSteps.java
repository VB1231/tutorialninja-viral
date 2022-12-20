package com.tutorialsninja.cucumber.steps;

import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class MyAccountSteps {
    @Given("^I am on home page for account$")
    public void iAmOnHomePageForAccount() {
    }

    @When("^I click on my account from homepage \"([^\"]*)\"$")
    public void iClickOnMyAccountFromHomepage(String option) {
        new MyAccountPage().clickOnMyAccount(option);

    }

    @Then("^I navigate to my account page$")
    public void iNavigateToMyAccountPage() {
        Assert.assertEquals("not verify", new MyAccountPage().verifyRegister(), "Register Account");
    }


    @And("^I fill all register field$")
    public void iFillAllRegisterField() {
        new RegisterPage().registerField();
    }

    @And("^I verify account created$")
    public void iVerifyAccountCreated() {
        Assert.assertEquals("not verify", new MyAccountPage().verifyAccountCreatedText(), "Your Account Has Been Created!");
    }

    @And("^I click on continue account$")
    public void iClickOnContinueAccount() {
        new MyAccountPage().clickOnContinueAccount();
    }

    @And("^I verify logout$")
    public void iVerifyLogout() {
        Assert.assertEquals("not verify", new MyAccountPage().verifyTextAccountLogOut(), "Account Logout");
    }

    @Then("^I click on continue$")
    public void iClickOnContinue() {
        new MyAccountPage().clickOnContinueAccount();
    }


    @And("^I enter email and password$")
    public void iEnterEmailAndPassword() {
        new LoginPage().enterEmailAndPassword();
    }

    @And("^I verify my account$")
    public void iVerifyMyAccount() {
        Assert.assertEquals("not verify", new LoginPage().verifyTextMyAccountLogin(), "My Account");
    }

    @And("^I click on Logout$")
    public void iClickOnLogout() {
        new MyAccountPage().clickOnMyAccount("Logout");

    }

    @And("^I verify account log out$")
    public void iVerifyAccountLogOut() {
        Assert.assertEquals("not verify", new MyAccountPage().verifyTextAccountLogOut(), "Account Logout");
    }

    @Then("^I click on continue after log out$")
    public void iClickOnContinueAfterLogOut() {
        new MyAccountPage().clickOnContinueAccount();
    }
}
