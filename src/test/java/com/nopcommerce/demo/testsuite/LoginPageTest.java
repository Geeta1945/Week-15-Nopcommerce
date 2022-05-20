package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void inIt() {

        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test

    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.clickOnLoginLink();
        String actual = loginPage.getWelcomePleaseSignInText();

        Assert.assertEquals(actual, "Welcome, Please Sign In!");
    }


    @Test
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailAddress("6prafulpatel20@gmail.com");
        loginPage.enterPasswordAddress("1244568");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getErrorMessage_Invalid_Credentials();
        Assert.assertEquals(actual, "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");

    }


    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailAddress("patelharit71@yahoo.com");
        loginPage.enterPasswordAddress("Geeta1945");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getLogOutText();
        Assert.assertEquals(actual,"Log out");
        loginPage.clickOnLogOutButton();

    }

       @Test
    public void VerifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailAddress("patelharit71@yahoo.com");
        loginPage.enterPasswordAddress("Geeta1945");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getLogOutText();
        Assert.assertEquals(actual,"Log out");
        loginPage.clickOnLogOutButton();
       String login_text = homePage.getTextFromLoginLink();
       Assert.assertEquals(login_text,"Log in");

    }


}
