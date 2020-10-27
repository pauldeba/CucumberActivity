package stepDefinations;

import stepDefinitions.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Setup {
	
	public Setup() {
		// TODO Auto-generated constructor stub
	}
	
	static WebDriver driver = new FirefoxDriver();
	static WebDriverWait wait = new WebDriverWait(driver,15);

	public static WebDriver setup() {
		FirefoxOptions option = new FirefoxOptions();
		option.setHeadless(true);	
		return driver;
	}
	
	
}
