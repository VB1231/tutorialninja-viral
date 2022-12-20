package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    WebElement selectMenu;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement selectMyAccount;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement verifyTextRegister;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement verifyAccountTextCreated ;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinueAccount ;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement verifyAccountLogOut ;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement verifyRegister;

    public String verifyRegister(){
        return getTextFromElement(verifyRegister);
    }
    public void clickOnMyAccount1(){
        clickOnElement(selectMyAccount);
    }



    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

    public void clickOnMyAccount(String s) {
        log.info("click on my account" + selectMyAccount.toString());
        clickOnElement(selectMyAccount);
        selectMyAccountOptions(s);
    }

    public String verifyRegisterPage() {
       log.info("verify text" + verifyTextRegister.toString());

        return getTextFromElement(verifyTextRegister);
    }

    public String verifyAccountCreatedText() {
       log.info("text verify" + verifyAccountTextCreated.toString());

        return getTextFromElement(verifyAccountTextCreated);
    }

    public void clickOnContinueAccount() {
        log.info("click on continue account" + clickOnContinueAccount.toString());

        clickOnElement(clickOnContinueAccount);
    }

    public String verifyTextAccountLogOut() {
       log.info("text verify" + verifyAccountLogOut.toString());
           return getTextFromElement(verifyAccountLogOut);
    }
}
