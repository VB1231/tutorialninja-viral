package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class LaptopsAndNoteBooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAndNoteBooksPage.class.getName());

    public LaptopsAndNoteBooksPage() {
        PageFactory.initElements(driver, this);
    }

    HomePage homePage = new HomePage();
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooks;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement verifyLaptopsAndNotebooksText;

    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    WebElement priceSelect;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement priceHighToLow;
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement selectMacBook;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement verifyTextMacBook;
    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement clickOnAddToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement verifySuccessFullyAddedToCart;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement clickOnShoppingCartInToSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement verifyTextMacBookShopping;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/input[1]")
    WebElement changeQty;
    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement clickOnUpdate;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-cart']/div[1]")
    WebElement verifyTextUpdate;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement verifyTotalPrice;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement clickOnCheckOut;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement verifyClickOnCheckout;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement verifyNewCustomer;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement selectGuestCheckOut;
    @CacheLookup
    @FindBy(id = "button-account")
    WebElement clickContinueAsGuest;

    public void selectLaptopAndNotebookPage() {
        log.info("laptop and notebooks" + laptopsAndNotebooks.toString());
        mouseHoverToElementAndClick(laptopsAndNotebooks);
        homePage.selectMenu("Show All Laptops & Notebooks");
    }

    public String verifyLaptopsAndNotebooksText() {
      log.info("verify text" + verifyLaptopsAndNotebooksText.toString());
        return getTextFromElement(verifyLaptopsAndNotebooksText);
    }

    public List<Double> beforePriceSort() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        // Collections.sort(originalProductsPrice, Collections.reverseOrder());
        return originalProductsPrice;
    }

    public List<Double> afterPriceSort() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        selectByVisibleTextFromDropDown(priceHighToLow, "Price (Low > High)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
        return afterSortByPrice;
    }

    public void selectPriceSortHighToLow() {
        log.info("select price high -low" + priceHighToLow.toString());
        selectByVisibleTextFromDropDown(priceHighToLow, "Price (Low > High)");
    }

    public void clickOnMacBook() {
        log.info("select mac book" + selectMacBook.toString());
         clickOnElement(selectMacBook);
    }

    public String verifyTextMacBook() {
        log.info("text mac book" + verifyTextMacBook.toString());
         return getTextFromElement(verifyTextMacBook);
    }

    public void clickOnAddToCart() {
        log.info("click on add to cart" + clickOnAddToCart.toString());
        clickOnElement(clickOnAddToCart);
    }

    public String verifySuccessFullyAddedToCart() {
        log.info("verify successfully added to cart" + verifySuccessFullyAddedToCart.toString());
        return getTextFromElement(verifySuccessFullyAddedToCart);
    }

    public void clickOnShoppingCartInToSuccessMessage() {
        log.info("click on shopping cart " + clickOnShoppingCartInToSuccessMessage.toString());
        clickOnElement(clickOnShoppingCartInToSuccessMessage);
    }

    public String verifyTextMacBookInShopping() {
        log.info("verify shopping cart" + verifyTextMacBookInShopping().toString());
         return getTextFromElement(verifyTextMacBookShopping);
    }

    public void changeQty() {
        changeQty.clear();
     //   log.info("change qty" + changeQty.toString());
        sendTextToElement(changeQty, "2");
       // log.info("click on update" + clickOnUpdate.toString());
         clickOnElement(clickOnUpdate);
    }

    public String verifyUpdatedMessage() {
        log.info("verify text " + verifyTextUpdate.toString());
         return getTextFromElement(verifyTextUpdate);
    }

    public String verifyTotalPrice() {
        log.info("verify total price" + verifyTotalPrice.toString());
         return getTextFromElement(verifyTotalPrice);
    }

    public void clickOnCheckOut() {
        log.info("click on check out" + clickOnCheckOut.toString());
         clickOnElement(clickOnCheckOut);
    }

    public String verifyTextClickOnCheckOut() {
        log.info("verify text" + verifyClickOnCheckout.toString());
         return getTextFromElement(verifyClickOnCheckout);
    }

    public String verifyNewCustomer() {
        log.info("verify text" + verifyNewCustomer.toString());
         return getTextFromElement(verifyNewCustomer);
    }

    public void selectGuestCheckOut() {
        log.info("select check out guest" + selectGuestCheckOut.toString());
         clickOnElement(selectGuestCheckOut);
        log.info("click as guest" + clickContinueAsGuest.toString());
        clickOnElement(clickContinueAsGuest);
    }
}
