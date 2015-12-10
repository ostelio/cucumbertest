package eu.dada.cucumbertest.driver;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import eu.dada.cucumbertest.bdd.steps.LoginSteps;

public class BrowserDriver {
	
	private final static int WAIT_TIMEOUT=500;

	private static final Logger LOGGER = Logger.getLogger(LoginSteps.class
			.getName());

	private static WebDriver mDriver;

	public synchronized static WebDriver getCurrentDriver() {
		if (mDriver == null) {
			try {
				mDriver = new FirefoxDriver(new FirefoxProfile());
			} finally {
				Runtime.getRuntime().addShutdownHook(
						new Thread(new BrowserCleanup()));
			}
		}
		return mDriver;
	}

	private static class BrowserCleanup implements Runnable {
		public void run() {
			LOGGER.info("Closing the browser");
			close();
		}
	}

	public static void close() {
		try {
			getCurrentDriver().quit();
			mDriver = null;
			LOGGER.info("closing the browser");
		} catch (UnreachableBrowserException e) {
			LOGGER.info("cannot close browser: unreachable browser");
		}
	}

	public static void loadPage(String url) {
		LOGGER.info("Directing browser to:" + url);
		getCurrentDriver().get(url);
	}
	
	public static void waitForElementByClass(String className){
		WebDriverWait wait = new WebDriverWait(getCurrentDriver(), WAIT_TIMEOUT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
	}
	
	public static void waitForElementById(String id){
		WebDriverWait wait = new WebDriverWait(getCurrentDriver(), WAIT_TIMEOUT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}
}
