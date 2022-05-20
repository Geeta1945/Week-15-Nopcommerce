package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("You are not navigated to Sign in page", "Welcome, Please Sign In!", new LoginPage().getWelcomePleaseSignInText());

    }


    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {

        new LoginPage().enterEmailAddress(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {

        new LoginPage().enterPasswordAddress(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {

        new LoginPage().clickOnLoginButton();
    }

    @Then("^I verify the error message$")
    public void iVerifyTheErrorMessage() {

        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found",new LoginPage().getErrorMessage_Invalid_Credentials());
    }


    @Then("^I verify logout link is displayed$")
    public void iVerifyLogoutLinkIsDisplayed() {
        Assert.assertEquals("","Log out",new LoginPage().getLogOutText());
    }

    @And("^I click on log out button$")
    public void iClickOnLogOutButton() {
        new LoginPage().clickOnLogOutButton();
    }

    @Then("^I verify login link displayed$")
    public void iVerifyLoginLinkDisplayed() {

        Assert.assertEquals("You are not on home page to log in", "Log in",new HomePage().getTextFromLoginLink());
    }


}
