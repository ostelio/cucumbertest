package eu.dada.cucumbertest.bdd.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/Login.feature",//path to the features
        format = {"json:target/integration_cucumber.json"},//what formatters to use
        tags = {"@run"})//what tags to include(@)/exclude(@~)

public class LoginTest {

}
