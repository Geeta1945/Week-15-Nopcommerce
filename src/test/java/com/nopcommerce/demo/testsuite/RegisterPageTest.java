package com.nopcommerce.demo.testsuite;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt() {

        loginPage = new LoginPage();
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        homePage.clickOnRegisterLink();
        String actual = registerPage.getRegisterText();
        Assert.assertEquals(actual, "Register");
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        String firstNameError = registerPage.getFirstNameErrorMessage();
        Assert.assertEquals(firstNameError, "First name is required.");
        String lastNameError = registerPage.getlastNameErrorMessage();
        Assert.assertEquals(lastNameError, "Last name is required.");
        String emailError = registerPage.getEmailErrorMessage();
        Assert.assertEquals(emailError, "Email is required.");
        String passwordError = registerPage.getPasswordErrorMessage();
        Assert.assertEquals(passwordError, "Password is required.");
        String confirmPasswordError = registerPage.getConfirmPAsswordErrorMessage();
        Assert.assertEquals(confirmPasswordError, "Password is required.");


    }


    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() {

        homePage.clickOnRegisterLink();
        registerPage.clickOnGenderButton();
        registerPage.enterFirstName("My First Name");
        registerPage.enterLastName("My Last Name");
        registerPage.enterEmail("geeta1945p@gmail.com");
        registerPage.enterPassword("Geeta1945");
        registerPage.enterConfirmPassword("Geeta1945");
        registerPage.clickOnRegisterButton();
        String registerCompleted_Text = registerPage.getRegistrationCompletedText();

    }


}
