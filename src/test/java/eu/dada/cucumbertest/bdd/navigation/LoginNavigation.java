package eu.dada.cucumbertest.bdd.navigation;

import eu.dada.cucumbertest.bdd.config.CredentialsType;
import eu.dada.cucumbertest.driver.BrowserDriver;
import eu.dada.cucumbertest.model.User;
import eu.dada.cucumbertest.model.UsersFactory;
import eu.dada.cucumbertest.pageobject.InboxPage;
import eu.dada.cucumbertest.pageobject.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class LoginNavigation {

	public void given_I_navigate_to_the_webmail_login_application(){
		BrowserDriver.loadPage("http://webmail-integration.register.it");

		LoginPage loginPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPage.class);
        loginPage.isDisplayedCheck();

    }

    public void when_I_try_to_login(String credentialsType){

        LoginPage loginPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPage.class);
        User user = getUser(credentialsType);

        loginPage.fillAccount(user.getUsername());
        loginPage.fillPassword(user.getPassword());

        loginPage.doLogin();

    }

    public void then_I_login(){

        InboxPage inboxPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), InboxPage.class);

        inboxPage.waitForLoading();
        inboxPage.isDisplayedCheck();

    }

    private User getUser(String credentialsType) {
        User user = null;
        CredentialsType ct = CredentialsType.credentialsTypeForName(credentialsType);
        switch(ct){
            case VALID:
                user = UsersFactory.createValidUser();
                break;
            case INVALID:
                user = UsersFactory.createInvalidUser();
                break;
        }
        return user;
    }
}
