package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephoneNumber;
    @CacheLookup
    @FindBy(id = "input-payment-company")
    WebElement company;
    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement cityField;
    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement  postCode;

    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement  countryField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='zone_id']")
    WebElement zone;
    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement acceptTerms;
    @CacheLookup
    @FindBy(id = "button-register")
    WebElement  clickContinue;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement  registerFirstName;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement  registerLastName;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement  registerEmailField;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement  registerTelephone;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement  registerPassword;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement  registerConfirmPassword;
    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement registerAcceptTerms;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement registerClickContinue;



    public void mandatoryField() {
        firstName.clear();
        log.info("enter first name" + firstName.toString());

        sendTextToElement(firstName, "Prime");
        log.info("enter last name" + lastName.toString());

        sendTextToElement(lastName, "Testing");
        emailField.clear();
        log.info("enter email " + emailField.toString());

        sendTextToElement(emailField, randomEmail());
        log.info("enter telephone number" + telephoneNumber.toString());

        sendTextToElement(telephoneNumber, "01923 630 555");
        log.info("enter company " + company.toString());

        sendTextToElement(company, "adsf");
        log.info("enter address" + addressField.toString());

        sendTextToElement(addressField, "14 The Avenue");
        log.info("enter postcode" + postCode.toString());

        sendTextToElement(postCode, "WD23 7AB");
        log.info("enter country field " + countryField.toString());

        selectByVisibleTextFromDropDown(countryField, "United Kingdom");
        log.info("enter zone " + zone.toString());

        selectByVisibleTextFromDropDown(zone, "Aberdeen");
        log.info("accept terms" + acceptTerms.toString());

        clickOnElement(acceptTerms);
        log.info("click on continue" + clickContinue.toString());

        clickOnElement(clickContinue);
    }

    public void registerField() {
        registerFirstName.clear();
        log.info("enter first name" + registerFirstName.toString());

        sendTextToElement(registerFirstName, "Prime");
        registerLastName.clear();
        log.info("enter last name" + registerLastName.toString());

        sendTextToElement(registerLastName, "Testing");
        registerEmailField.clear();
        log.info("enter email" + registerEmailField.toString());

        sendTextToElement(registerEmailField, randomEmail());
        log.info("enter telephone" + registerTelephone.toString());

        sendTextToElement(registerTelephone, "01923 630 555");
        log.info("enter password" + registerPassword.toString());

        sendTextToElement(registerPassword, "Welcome123");
        log.info("enter confirm password" + registerConfirmPassword.toString());

        sendTextToElement(registerConfirmPassword, "Welcome123");
        log.info("Accept terms" + registerAcceptTerms.toString());

        clickOnElement(registerAcceptTerms);
      log.info("click on continue" + registerClickContinue.toString());

        clickOnElement(registerClickContinue);

    }
}
