package eu.dada.cucumbertest.navigation;

import java.util.logging.Logger;

import org.openqa.selenium.internal.FindsById;

import eu.dada.cucumbertest.bdd.steps.LoginSteps;
import eu.dada.cucumbertest.contatiner.LoginContainer;
import eu.dada.cucumbertest.driver.BrowserDriver;

public class LoginView {

	private static final Logger LOGGER = Logger.getLogger(LoginSteps.class
			.getName());
	
	private static LoginContainer loginContainer = new LoginContainer();
	
	public void isDisplayedCheck(){
		LOGGER.info("Checking login page is displayed");
		//if(loginContainer.loginPageDiv == null)
		//	System.out.println("é Wuoto");
		//String c = loginContainer.loginPageDiv.getAttribute("id");
		BrowserDriver.waitForElementById("login");
		loginContainer.loginPageDiv.isDisplayed();
	}
}
