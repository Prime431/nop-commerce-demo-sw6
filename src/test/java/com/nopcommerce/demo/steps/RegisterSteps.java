package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I Click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("I Select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGenderFemale();
    }

    @And("I Enter firstname")
    public void iEnterFirstname() {
        new RegisterPage().enterFirstName("Dd");
    }

    @And("I Enter lastname")
    public void iEnterLastname() {
        new RegisterPage().enterLastName("Patel");
    }

    @And("I Select day")
    public void iSelectDay() {
        new RegisterPage().selectDay("4");
    }

    @And("I Select month")
    public void iSelectMonth() {
        new RegisterPage().selectMonth("jan");
    }

    @And("I Select year")
    public void iSelectYear() {
        new RegisterPage().selectYear("1970");
    }

    @And("I Enter email")
    public void iEnterEmail() {
       new RegisterPage().enterEmail("Dd@gmail.com");
    }

    @And("I Enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("Password123");
    }

    @And("I Enter Confirm Password")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword("Password123");
    }

    @And("I Verify message {string}")
    public void iVerifyMessage(String errorMessage) {
        Assert.assertEquals(new RegisterPage().getRegisterActualText(),"Your registration completed");

    }

    @Then("I Verify Register text")
    public void iVerifyRegisterText() {
        Assert.assertEquals(new HomePage().getRegisterText(), "Register");
    }

    @Then("I Click on REGISTER button")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I Verify the error message First name is required.")
    public void iVerifyTheErrorMessageFirstNameIsRequired() {
            Assert.assertEquals(new RegisterPage().textFirstNameIsRequire(), "First name is required.");
        }

    @And("I Verify the error message Last name is required.")
    public void iVerifyTheErrorMessageLastNameIsRequired() {
        Assert.assertEquals(new RegisterPage().textLastNameIsRequire(), "Last name is required.");
    }


    @And("I Verify the error message Email is required.")
    public void iVerifyTheErrorMessageEmailIsRequired() {
        Assert.assertEquals(new RegisterPage().textEmailIsRequire(),"Email is required.");
    }

    @And("I Verify the error message Password is required.")
    public void iVerifyTheErrorMessagePasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().textPasswordIsRequire(),"Password is required.");
    }

    @And("I Verify the error message for Confirm Password is required.")
    public void iVerifyTheErrorMessageForConfirmPasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().textConfirmPasswordIsRequire(),"Password is required.");
    }

    @Given("I am on home page")
    public void iAmOnHomePage() {

    }
}

