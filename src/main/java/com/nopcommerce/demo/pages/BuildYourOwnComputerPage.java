package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hdd320;
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hdd400;


    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osVista_Home;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osVista_Premium;


    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement software_Microsoft;
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement software_Acrobat;
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement software_Commander;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement popUpMessage;


    public void selectProcessorFromDropDown(String myProcessor) {
        selectByVisibleTextFromDropDown(processor, myProcessor);
        log.info("Selecting processor from text" + processor.toString());
    }

    public void selectRAM_FromDropDown(String myRam) {
        selectByVisibleTextFromDropDown(ram, myRam);
    }

    public void selectHdd(String myHdd) {
        if (myHdd == "320 GB") {
            clickOnElement(hdd320);
            log.info("Clicking hdd 320 button from : " + hdd320.toString());
        } else {

            clickOnElement(hdd400);
            log.info("Clicking hdd 400 button from : " + hdd400.toString());
        }
    }

    public void select_Os(String myOs) {

        if (myOs == "Vista Premium [+$60.00]") {
            clickOnElement(osVista_Premium);
            log.info("Clicking  vista premium button from : " + osVista_Premium.toString());
        } else {
            clickOnElement(osVista_Home);
            log.info("Clicking  vista home button from : " + osVista_Home.toString());
        }
    }

    public void select_Software(String mySoftware) {
        clickOnElement(software_Microsoft);
        if (mySoftware == "Acrobat Reader [+$10.00]") {
            clickOnElement(software_Acrobat);
            log.info("Clicking software acrobat button from : " + software_Acrobat.toString());
        } else if (mySoftware == "Total Commander [+$5.00]") {
            clickOnElement(software_Commander);
            log.info("Clicking software command button from : " + software_Commander.toString());
        } else if (mySoftware == "Microsoft Office [+$50.00]") {
            clickOnElement(software_Microsoft);
            log.info("Clicking  software microsoft button from : " + software_Microsoft.toString());
        }
    }

    public void clickOnAddToCart() {

        clickOnElement(addToCart);
        log.info("Clicking  add to cart button from : " + addToCart.toString());
    }

    public String getTextFromPopUp() {
        log.info("Getting pop up message from : " + popUpMessage.toString());
        return getTextFromElement(popUpMessage);

    }
}
