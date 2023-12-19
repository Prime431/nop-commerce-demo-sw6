package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
  private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

// By loginLink = By.linkText("Log in");



    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeActualText;




    public void enterEmailAddressOnLoginEmailField(String email) {
        sendTextToElement(emailField, email);
        log.info("email " + emailField.toString());
    }

    public void enterPasswordInPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }
    public String getWelcomePleaseSignInActualText(){
        String message = getTextFromElement(welcomeActualText);
        log.info("Getting text from : " + welcomeActualText.toString());
        return message;
    }
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    public void enterPassword(String pasword) {
        sendTextToElement(password, pasword);
        log.info("password" + password.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logIn;
    public void clickOnLoginButton() {
     clickOnElement(logIn);
    }

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement loginErrorMessage;
    public String getLoginButtonErrorMessage() {
        String actualText = getTextFromElement(loginErrorMessage);
        log.info("Getting text from : " + loginErrorMessage.toString());
        return actualText;
    }

    @CacheLookup
    @FindBy(css = ".ico-logout")
    WebElement logout;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLinkk;

    public String getLogoutText() {
        String message = getTextFromElement(loginLinkk);
        log.info("Getting text from : " + loginLinkk.toString());
        return message;
    }

        public String getLoginText() {
            String message = getTextFromElement(logout);
            log.info("Getting text from : " + logout.toString());
            return message;

}

    }


