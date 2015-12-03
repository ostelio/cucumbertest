package eu.dada.cucumbertest.navigation;

import eu.dada.cucumbertest.driver.BrowserDriver;

public class Navigation {

	private LoginView loginView = new LoginView();
	
	public void given_I_navigate_to_the_webmail_login_application(){
		BrowserDriver.loadPage("http://webmail-integration.register.it");
		loginView.isDisplayedCheck();
	}

}
