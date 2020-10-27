package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;

public class Login extends Setup{

	@Given("^Login$")
	public void login() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	public WebDriver val() {
		return driver;
	}
	
	public Login() {
		//constructor
	}

}
