package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegistrationSteps {
    @When("^I click on registration link$")
    public void iClickOnRegistrationLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I verify \"([^\"]*)\" text$")
    public void iVerifyText(String message)  {

        Assert.assertEquals("You are not on registration page",message,new RegisterPage().getRegisterText());
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^I verify the error message \"([^\"]*)\"$")
    public void iVerifyTheErrorMessage(String firstNameError)  {

        Assert.assertEquals("First name not entered",firstNameError,new RegisterPage().getFirstNameErrorMessage());
    }

    @And("^I Verify the last name error message \"([^\"]*)\"$")
    public void iVerifyTheLastNameErrorMessage(String lastNameError)  {
        Assert.assertEquals("Last name not entered",lastNameError, new RegisterPage().getlastNameErrorMessage());

    }

    @And("^I Verify the email error message \"([^\"]*)\"$")
    public void iVerifyTheEmailErrorMessage(String emailError)  {

        Assert.assertEquals("Email not entered",emailError,new RegisterPage().getEmailErrorMessage());
    }

    @Then("^I can not register successfully$")
    public void iCanNotRegisterSuccessfully() {

    }

    @And("^I Verify the password error message \"([^\"]*)\"$")
    public void iVerifyThePasswordErrorMessage(String passwordError)  {
       Assert.assertEquals("password not entered",passwordError,new RegisterPage().getPasswordErrorMessage());
    }

    @And("^I Verify the confirm password error message \"([^\"]*)\"$")
    public void iVerifyTheConfirmPasswordErrorMessage(String confirmPasswordError)  {
        Assert.assertEquals("Confirm password not entered",confirmPasswordError,new RegisterPage().getConfirmPAsswordErrorMessage());
    }

    @And("^I select gender \"([^\"]*)\"$")
    public void iSelectGender(String gender)  {

        new RegisterPage().clickOnGenderButton();

    }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("^I enter Last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new RegisterPage().enterLastName(lastName);
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email)  {
        new RegisterPage().enterEmail(email);
    }

    @And("^I enter password to register \"([^\"]*)\"$")
    public void iEnterPasswordToRegister(String password)  {
        new RegisterPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword)  {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @Then("^I verify message \"([^\"]*)\"$")
    public void iVerifyMessage(String message)  {
       Assert.assertEquals("",message, new RegisterPage().getRegistrationCompletedText());
    }
}
