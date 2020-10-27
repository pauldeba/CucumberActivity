package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Google Home Page$")
	public void givenFunctionName() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,15);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@When("^User types in Cheese and hits ENTER$")
	public void whenFunctionName() {
		driver.findElement(By.name("q")).sendKeys("Cheese",Keys.ENTER);
	}

	@Then("^Show how many search results were shown$")
	public void thenFunctionName() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id=\"result-stats\"]")));
		String resultStats = driver.findElement(By.xpath("//div[@id=\"result-stats\"]")).getText();
		System.out.println("Number Of Results Found: "+resultStats);	
		
	}
	
	@And("^Close the browser$")
	public void closeTheBrowser() throws Throwable {
		driver.close();
	}

}
