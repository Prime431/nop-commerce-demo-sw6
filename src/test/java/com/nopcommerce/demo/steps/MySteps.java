package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;
import org.testng.Assert;

public class MySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLogInLink();
    }

    @Then("I should verify that {string} message display")
    public void iShouldVerifyThatMessageDisplay(String errorMessage) {
        Assert.assertEquals(new LoginPage().getWelcomePleaseSignInActualText(),errorMessage, "Welcome, Please Sign In!");
    }

    @And("Enter EmailId {string}")
    public void enterEmailId(String email) {
        new LoginPage().enterEmailAddressOnLoginEmailField(email);
    }

    @And("Enter Password {string}")
    public void enterPassword(String password) {
        new LoginPage().enterPasswordInPasswordField(password);

    }

    @Then("Click on Login Button")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("Verify that LogOut link is display")
    public void verifyThatLogOutLinkIsDisplay() {
     Assert.assertEquals(new LoginPage().getLogoutText(),"Log in");
    }


    @And("Verify that LogIn Link Display")
    public void verifyThatLogInLinkDisplay() {
        Assert.assertEquals(new LoginPage().getLoginText(),"Log in");
    }

    @And("Verify that the Error message {string}")
    public void verifyThatTheErrorMessage(String errorMessage) {
       Assert.assertEquals(new LoginPage().getLoginButtonErrorMessage(),errorMessage, "Login was unsuccessful. Please correct the errors and try again.");
    }

    @Then("Click on LogOut Link")
    public void clickOnLogOutLink() {
        new HomePage().clickOnLogOutLink();
    }
}
