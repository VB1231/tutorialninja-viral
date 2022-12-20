package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement clickLogin;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement verifyTextFromMyAccountLogin;


    public void enterEmailAndPassword() {
       log.info("enter email" + emailField.toString());
         sendTextToElement(emailField, "viral@gmail.com");
        log.info("enter password" + passwordField.toString());
        sendTextToElement(passwordField, "Welcome123");
        log.info("click on login" + clickLogin.toString());
         clickOnElement(clickLogin);
    }

    public String verifyTextMyAccountLogin() {
        log.info("verify text" + verifyTextFromMyAccountLogin.toString());
         return getTextFromElement(verifyTextFromMyAccountLogin);
    }
}
