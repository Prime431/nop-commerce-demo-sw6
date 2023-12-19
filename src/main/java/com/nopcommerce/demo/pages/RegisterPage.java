package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
 private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    @CacheLookup
    @FindBy(css = "#register-button")
    WebElement registerButton;

    public void  clickOnRegisterButton() {

        clickOnElement(registerButton);
        new RegisterPage().clickOnRegisterButton();
    }

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameIsRequiredText;

    public String textFirstNameIsRequire() {
        String actualText = getTextFromElement(firstNameIsRequiredText);
        return actualText;
    }

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameIsRequiredText;

    public String textLastNameIsRequire() {
        String actualText = getTextFromElement(lastNameIsRequiredText);
        return actualText;
    }

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailIsRequiredText;

    public String textEmailIsRequire() {
        String actualText = getTextFromElement(emailIsRequiredText);
        return actualText;
    }

    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordIsRequiredText;

    public String textPasswordIsRequire() {
        String actualText = getTextFromElement(passwordIsRequiredText);
        return actualText;
    }

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordIsRequiredText;

    public String textConfirmPasswordIsRequire() {
        String actualText = getTextFromElement(confirmPasswordIsRequiredText);
        return actualText;
    }

    @CacheLookup
    @FindBy(css = ".result")
    WebElement registrationCompletedText;

    public String actualRegistrationCompletedText() {
        String actualText = getTextFromElement(registrationCompletedText);
        return actualText;
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement RegisterActualText;

    public String getRegisterActualText() {
        String message = getTextFromElement(RegisterActualText);
        return message;
    }

    @CacheLookup
    @FindBy(css = "label[for='gender-female']")
    WebElement femaleRadioButton;
    public void selectGenderFemale() {
        clickOnElement(femaleRadioButton);
        new RegisterPage().selectGenderFemale();
    }
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    public void enterFirstName(String fName) {

        sendTextToElement(firstName, fName);
        new RegisterPage().sendTextToElement(firstName,"Remo");
    }
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    public void enterLastName(String lName) {

        sendTextToElement(lastName, lName);
        new RegisterPage().sendTextToElement(lastName,"Patel");
    }
    @CacheLookup
    @FindBy(id = "Email")
    WebElement eMail;
    public void enterEmail(String email) {

        sendTextToElement(eMail, email);
        new RegisterPage().sendTextToElement(eMail,"Remo@gmail.com");
    }


    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwords;
    public void enterPassword(String password) {

        sendTextToElement(passwords, password);
        new RegisterPage().sendTextToElement(passwords,"Password123");
    }
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    public void enterConfirmPassword(String password) {

        sendTextToElement(confirmPassword, password);
        new RegisterPage().sendTextToElement(confirmPassword,"Password123");
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logOut;
    public void clickOnLogOutButton() {

        clickOnElement(logOut);
        new RegisterPage().clickOnLogOutButton();
    }
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement days;
    public void selectDay(String day){

        selectByValueFromDropDown(days, day);
        new RegisterPage().selectDay("7");
    }

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement months;
    public void selectMonth(String month){

        selectByValueFromDropDown(months, month);
        new RegisterPage().selectMonth("1");
    }
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement years;
    public void selectYear(String year){

        selectByValueFromDropDown(years, year);
        new RegisterPage().selectYear("1990");
    }

}

