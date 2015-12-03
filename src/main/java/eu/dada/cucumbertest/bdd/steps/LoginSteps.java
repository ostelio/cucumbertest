package eu.dada.cucumbertest.bdd.steps;

import java.util.logging.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import eu.dada.cucumbertest.navigation.Navigation;

public class LoginSteps {

	private static final Logger LOGGER = Logger.getLogger(LoginSteps.class
			.getName());

	
	private Navigation navigation = new Navigation();;
		
	@Given("^I navigate to the webmail login application$")
	public void given_I_navigate_to_the_webmail_login_application() {
		LOGGER.info("Entering: I navigate to the mock application");
		navigation.given_I_navigate_to_the_webmail_login_application();
	}

	@When("^I try to login with '(.+)' credentials$")
	public void when_I_try_to_login(String credentialsType) {
		LOGGER.info("Entering: I try to login with " + credentialsType
				+ " credentials");
	}

	@Then("^I should see that I logged in '(.+)'$")
	public void then_I_login(String outcome) {
		LOGGER.info("Entering: I should see that I logged in " + outcome);
	}

}
