package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;

public class ComputerSteps {
    @When("^I click on computer tab$")
    public void iClickOnComputerTab() {
      new HomePage().clickOnComputerLink();
    }

    @Then("^I verify \"([^\"]*)\" text displayed on the page$")
    public void iVerifyTextDisplayedOnThePage(String message) {

        Assert.assertEquals("You are not on computer page",message,new ComputerPage().getText_Computers());
    }

    @And("^I click on desktops link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktops();
    }

    @Then("^I verify \"([^\"]*)\" text displayed on page$")
    public void iVerifyTextDisplayedOnPage(String text)  {

        Assert.assertEquals("You are not on Desktops page",text,new DesktopsPage().getDesktopText());
    }

    @And("^I click on product name \"([^\"]*)\"$")
    public void iClickOnProductName(String product) {

        new DesktopsPage().mouseHoverAndClickOnBuildComputer();

    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor)  {
        new BuildYourOwnComputerPage().selectProcessorFromDropDown(processor);
    }

    @And("^I select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRAM_FromDropDown(ram);
    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String hdd)  {
        new BuildYourOwnComputerPage().selectHdd(hdd);
    }

    @And("^I select os \"([^\"]*)\"$")
    public void iSelectOs(String os) {
        new BuildYourOwnComputerPage().select_Os(os);
    }

    @And("^I select software \"([^\"]*)\"$")
    public void iSelectSoftware(String software)  {
        new BuildYourOwnComputerPage().select_Software(software);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {

        new BuildYourOwnComputerPage().clickOnAddToCart();
    }


    @Then("^I verify message \"([^\"]*)\" once finished$")
    public void iVerifyMessageOnceFinished(String message)  {

        Assert.assertEquals("",message,new BuildYourOwnComputerPage().getTextFromPopUp());

    }


}
