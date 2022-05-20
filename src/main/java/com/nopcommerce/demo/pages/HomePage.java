package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computer;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement electronics;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
    WebElement apparel;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
    WebElement digitalDownload;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement books;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
            WebElement jewelry;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
    WebElement giftCards;

    @FindBy(xpath = "/img[@alt='nopCommerce demo store']")
            WebElement nopcommerceLogo;
    public void clickOnComputerLink(){

        mouseHoverToElementAndClick(computer);
        log.info("Clicking  Computer Link from : " + computer.toString());
    }

    public void clickOnLoginLink(){

        mouseHoverToElementAndClick(loginLink);
        log.info("Clicking login link from : " + loginLink.toString());
    }
    public String getTextFromLoginLink(){
        log.info("Getting login link text  from : " + loginLink.toString());
        return    getTextFromElement(loginLink);
    }

    public void clickOnRegisterLink(){

        mouseHoverToElementAndClick(registerLink);
        log.info("Mouse hover on register link text  from : " + registerLink.toString());
    }


    public void clickOnElectronicsLink(){

        mouseHoverToElementAndClick(electronics);
        log.info("Mouse hover on electronics link text  from : " + electronics.toString());
    }
    public void clickOnApparelLink(){

        mouseHoverToElementAndClick(apparel);
        log.info("Mouse hover on apparel link text  from : " + apparel.toString());
    }
    public void clickOnDigitalDownloadsLink(){

        mouseHoverToElementAndClick(digitalDownload);
        log.info("Mouse hover on digital download link text  from : " + digitalDownload.toString());
    }
    public void clickOnBooksLink(){

        mouseHoverToElementAndClick(books);
        log.info("Mouse hover on books link text  from : " + books.toString());
    }
    public void clickOnJewelryLink(){

        mouseHoverToElementAndClick(jewelry);
        log.info("Mouse hover on jewelry link text  from : " + jewelry.toString());
    }
    public void clickOnGiftCardsLink(){

        mouseHoverToElementAndClick(giftCards);
        log.info("Mouse hover on gift cards link text  from : " + giftCards.toString());
    }

    public String getTextFromNopCommerceLogo(){

        log.info("Getting nopcommerce text  from : " + nopcommerceLogo.toString());

    return    getTextFromElement(nopcommerceLogo);
    }


}

