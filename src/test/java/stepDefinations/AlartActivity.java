package stepDefinations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlartActivity {
	WebDriver driver;
	WebDriverWait wait;
	Alert alert;
	
	@Given("^User is on the Page$")
	public void login() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,15);
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		driver.manage().window().maximize();
	}
	
	@When("^User clicks the Simple Alert button$")
	public void simpleAlart() {
		driver.findElement(By.id("simple")).click();
	}
	
	@When("^User clicks the Confirm Alert button$")
	public void confirmAlart() {
		driver.findElement(By.id("confirm")).click();
	}
	
	@When("^User click the Prompt Alert button$")
	public void promptAlart() {
		driver.findElement(By.id("prompt")).click();
	}
	
	@Then("^Alart Opens$")
	public void alartOpens() {
		alert = driver.switchTo().alert();
	}
	
	@And("^Read the text from it and print it$")
	public void readText() throws InterruptedException {
		Thread.sleep(3000);
		String text = alert.getText();
		System.out.println("Alert Text: "+text);
	}
	
	@And("^Close the alert$")
	public void closeAlert() {
		alert.accept();
	}
	
	@And("^Close the alart with Cancel$")
	public void closeCancelAlert() {
		alert.dismiss();
	}
	
	@And("^Write a custom message in it$")
	public void writeMessageOnAlert() {
		alert.sendKeys("test");
	}
	
	@And("^Close Browser$")
	public void closeBrowser() {
		driver.close();
	}

	public AlartActivity() {
		// TODO Auto-generated constructor stub
	}

}
