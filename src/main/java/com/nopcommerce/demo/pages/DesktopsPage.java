package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    /*
    Desktops text, Sortby, Display, selectProductList Locators and it's actions
     */


    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktop_Text;

    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement display;
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement buildComputer;

    public String getDesktopText() {
        log.info("Getting desktop text  from : " + desktop_Text.toString());
        return getTextFromElement(desktop_Text);
    }

    public void selectProducts_SortBy(String option) {

        selectByVisibleTextFromDropDown(sortBy, option);
        log.info("Select option from Sort by drop down : " + sortBy.toString());
    }

    public void selectProducts_Display(String option) {

        selectByVisibleTextFromDropDown(display, option);
        log.info("Select option from display drop down : " + display.toString());
    }

    public void mouseHoverAndClickOnBuildComputer() {
        mouseHoverToElementAndClick(buildComputer);
        log.info("Mouse hover and click on build on computer : " + buildComputer.toString());

    }

}
