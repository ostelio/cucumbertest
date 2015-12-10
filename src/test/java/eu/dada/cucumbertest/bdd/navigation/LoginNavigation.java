package eu.dada.cucumbertest.bdd.navigation;

import eu.dada.cucumbertest.driver.BrowserDriver;
import eu.dada.cucumbertest.pageobject.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class LoginNavigation {

	public void given_I_navigate_to_the_webmail_login_application(){
		BrowserDriver.loadPage("http://webmail-integration.register.it");
		//loginView.isDisplayedCheck();

		LoginPage loginPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPage.class);
		loginPage.isDisplayedCheck();
	}

}
