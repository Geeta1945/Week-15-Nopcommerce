package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod
    public void inIt() {

        loginPage = new LoginPage();
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputerLink();
        String actual = computerPage.getText_Computers();
        Assert.assertEquals(actual, "Computers");

    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        homePage.clickOnComputerLink();
        computerPage.clickOnDesktops();
        String actual = desktopsPage.getDesktopText();
        Assert.assertEquals(actual, "Desktops");
    }

    @Test(dataProvider = "processor",dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) throws InterruptedException {
        homePage.clickOnComputerLink();
        computerPage.clickOnDesktops();
        desktopsPage.mouseHoverAndClickOnBuildComputer();
        buildYourOwnComputerPage.selectProcessorFromDropDown(processor);
        buildYourOwnComputerPage.selectRAM_FromDropDown(ram);
        buildYourOwnComputerPage.selectHdd(hdd);
        Thread.sleep(2000);
        buildYourOwnComputerPage.select_Os(os);
        Thread.sleep(2000);
        buildYourOwnComputerPage.select_Software(software);
        buildYourOwnComputerPage.clickOnAddToCart();
        Thread.sleep(3000);
        String productAddedMessage = buildYourOwnComputerPage.getTextFromPopUp();
        System.out.println(productAddedMessage);
        Assert.assertEquals(productAddedMessage,"The product has been added to your shopping cart");
    }


}
