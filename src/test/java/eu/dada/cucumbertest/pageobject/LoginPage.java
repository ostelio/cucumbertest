package eu.dada.cucumbertest.pageobject;

import eu.dada.cucumbertest.bdd.steps.LoginSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.logging.Logger;

public class LoginPage {

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class.getName());

    /**
     * Al posto di usare WebElement loginPage = BrowserDriver.getCurrentDriver().findElement(By.id("login"));
     * Si usa FinfBy per settare la proprietà privata di LoginPage: Classe che rappresenta la pagina di login
     * secondo il PageObject Pattern.
     *
     * LoginPage definisce tutti gli elementi della pagina con cui interagire e i metodi che permettono l'interazione.
     */
    @FindBy(how = How.ID, using = "submit")
    private WebElement loginButton;

    @FindBy(how = How.NAME, using = "account")
    private WebElement accountInput;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordInput;

    public void isDisplayedCheck(){
        LOGGER.info("Checking login page is displayed");
        loginButton.isDisplayed();
    }

    public void fillAccount(String account){
        LOGGER.info("Filling account input with " + account);
        accountInput.sendKeys(account);
    }

    public void fillPassword(String password){
        LOGGER.info("Filling password input with " + password);
        passwordInput.sendKeys(password);
    }

    public void doLogin(){
        LOGGER.info("Click on login button");
        loginButton.click();
    }
}
