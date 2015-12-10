package eu.dada.cucumbertest.contatiner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginContainer {
	
	@FindBy(how = How.ID, using = "gsr")
	public WebElement loginPageDiv;
	
//	@FindBy(how = How.CSS, using = "#form-group input[name=username]")
//	public WebElement usernameInput;
//	
//	@FindBy(how = How.CSS, using = "#form-group input[name=password]")
//	public WebElement passwordInput;
//	
//	@FindBy(how = How.CSS, using = "#form-group span[role='button']")
//	public WebElement submitButton;
}
