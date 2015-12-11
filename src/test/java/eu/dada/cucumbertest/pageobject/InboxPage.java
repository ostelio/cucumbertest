package eu.dada.cucumbertest.pageobject;

import eu.dada.cucumbertest.driver.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class InboxPage {

    private static final Logger LOGGER = Logger.getLogger(InboxPage.class.getName());

    @FindBy(how = How.ID, using = "io-ox-top-logo-small")
    private WebElement logo;


    public void waitForLoading(){
        LOGGER.info("Waiting... inbox page is loading");
        WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), 5);
        wait.until(ExpectedConditions.elementToBeSelected(logo));
    }

    public void isDisplayedCheck(){
        LOGGER.info("Checking webmail inbox page is displayed");
        logo.isDisplayed();
    }
}
