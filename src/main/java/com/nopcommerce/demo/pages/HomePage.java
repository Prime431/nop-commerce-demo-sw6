package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
  private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computer;
    @CacheLookup
    @FindBy(xpath = "(//h1[normalize-space()='Computers'])[1]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement apparelMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloadsMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement booksMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jewelryMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCardsMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;


    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(css = ".ico-logout")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    public String getRegisterText(){
        String actualMessage = getTextFromElement(registerText);
        return actualMessage;
    }
    public String getComputerText(){
        //log.info("Getting computer Text " + computerText.toString());
        String actualText = new ComputerPage().getTextFromElement(computerText);
        return actualText;
    }

    public void clickOnElectronicsMenu() {
        clickOnElement(electronicsMenu);
    }

    public void clickOnComputer(){
        clickOnElement(computer);
        log.info("Enter Computer Link " + computer.toString() );

    }

    public void clickOnApparelMenu() {
        clickOnElement(apparelMenu);
    }

    public void clickOnDigitalDownloadsMenu() {
        clickOnElement(digitalDownloadsMenu);
    }

    public void clickOnBooksMenu() {
        clickOnElement(booksMenu);
    }

    public void clickOnJewelryMenu() {
        clickOnElement(jewelryMenu);
    }

    public void clickOnGiftCardsMenu() {
        clickOnElement(giftCardsMenu);
    }

    public void clickOnLogInLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOutLink() {
        clickOnElement(logOutLink);
    }}
