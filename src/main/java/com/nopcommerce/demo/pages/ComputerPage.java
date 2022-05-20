package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computer_Text;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement desktops;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement notebooks;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/h2[1]/a[1]")
    WebElement software;

    public String getText_Computers() {
        log.info("Getting computer text from : " + computer_Text.toString());
        return getTextFromElement(computer_Text);
    }

    public void clickOnDesktops() {

        mouseHoverToElementAndClick(desktops);
        log.info("Mouse hover and click on desktops text  from : " + desktops.toString());
    }

}
