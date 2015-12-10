package eu.dada.cucumbertest.pageobject;

import eu.dada.cucumbertest.bdd.steps.LoginSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.logging.Logger;

public class LoginPage {

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class.getName());

    @FindBy(how = How.ID, using = "submit") private WebElement loginButton;


    public void isDisplayedCheck(){
        LOGGER.info("Checking login page is displayed");
        loginButton.isDisplayed();

		/*WebElement loginPage = BrowserDriver.getCurrentDriver().findElement(By.id("login"));
		loginPage.isDisplayed();*/
    }

    /*public void clickExitButton() {
        exitButton.click();
    }Ø
    public LoginPage logout() {
        clickExitButton();
        return PageFactory.initElements(driver, LoginPage.class);
    }*/



//	@FindBy(how = How.ID, using = "login")
//	public WebElement loginPageDiv;
//
//	@FindBy(how = How.CSS, using = "#form-group input[name=username]")
//	public WebElement usernameInput;
//	
//	@FindBy(how = How.CSS, using = "#form-group input[name=password]")
//	public WebElement passwordInput;
//	
//	@FindBy(how = How.CSS, using = "#form-group span[role='button']")
//	public WebElement submitButton;

}
