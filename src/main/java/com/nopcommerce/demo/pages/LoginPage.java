package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage_InvalidCredentials;


    public String getWelcomePleaseSignInText() {
        log.info("Getting welcome text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailAddress(String myEmail) {
        sendTextToElement(email, myEmail);
        log.info("Entering email address from : " + email.toString());
    }

    public void enterPasswordAddress(String myPassword) {

        sendTextToElement(password, myPassword);
        log.info("Entering password from : " + password.toString());

    }

    public void clickOnLoginButton() {

        clickOnElement(loginButton);
        log.info("Clicking login button from : " + loginButton.toString());
    }


    public void clickOnLogOutButton() {

        clickOnElement(logOut);
        log.info("Clicking logout button from : " + logOut.toString());
    }

    public String getLogOutText() {
        log.info("Getting log out text  from : " + logOut.toString());
        return getTextFromElement(logOut);
    }

    public String getErrorMessage_Invalid_Credentials() {
        log.info("Getting error message for entering invalid credentials from : " + errorMessage_InvalidCredentials.toString());

        return getTextFromElement(errorMessage_InvalidCredentials);
    }


}
