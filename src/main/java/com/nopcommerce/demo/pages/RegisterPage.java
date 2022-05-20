package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registration_Button;

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    //
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderButton;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement password_Error;


    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPassword_Error;


    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleteText;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    public String getRegisterText() {
        log.info("Getting register text from : " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public String getFirstNameErrorMessage() {
        log.info("Getting first name error message from : " + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String getlastNameErrorMessage() {
        log.info("Getting last name error message from : " + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String getEmailErrorMessage() {
        log.info("Getting email error message from : " + emailError.toString());
        return getTextFromElement(emailError);
    }

    public String getPasswordErrorMessage() {
        log.info("Getting password error message from : " + password_Error.toString());
        return getTextFromElement(password_Error);
    }

    public String getConfirmPAsswordErrorMessage() {
        log.info("Getting confirm password message from : " + confirmPassword_Error.toString());
        return getTextFromElement(confirmPassword_Error);
    }

    public void clickOnRegisterButton() {

        clickOnElement(registration_Button);
        log.info("Clicking registration button from : " + registration_Button.toString());
    }

    public void clickOnGenderButton() {

        clickOnElement(genderButton);
        log.info("Clicking gender button from : " + genderButton.toString());
    }

    public void enterFirstName(String myFirstName) {

        sendTextToElement(firstName, myFirstName);
        log.info("Entering first name from : " + firstName.toString());
    }

    public void enterLastName(String mySecondName) {

        sendTextToElement(lastName, mySecondName);
        log.info("Entering last name from : " + lastName.toString());

    }

    public void enterEmail(String myEmail) {
        sendTextToElement(email, myEmail);
        log.info("Entering email from : " + email.toString());

    }

    public void enterPassword(String myPassword) {
        sendTextToElement(password, myPassword);
        log.info("Entering password from : " + password.toString());

    }

    public void enterConfirmPassword(String myConfirmPassword) {
        sendTextToElement(confirmPassword, myConfirmPassword);
        log.info("Entering confirm password from : " + confirmPassword.toString());

    }

    public String getRegistrationCompletedText() {

        log.info("Getting registration completed text from : " + registrationCompleteText.toString());
        return getTextFromElement(registrationCompleteText);
    }


}
