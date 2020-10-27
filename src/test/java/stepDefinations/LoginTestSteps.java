package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginTestSteps {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Login page$")
	public void login() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,15);
		driver.get("https://www.training-support.net/selenium/login-form");
		driver.manage().window().maximize();
	}
	
	@When("^User enters username and password$")
	public void enterUser() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class=\"ui button\"]")).click();
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void enterUserDetails(String username, String password) throws Throwable{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class=\"ui button\"]")).click();
	}
	
	@When("^User enters credentials:$")
	public void enterCredentials(DataTable table) throws Throwable {
		List<List<String>> data = table.asLists();
		System.out.println(data);
		for(int i=0; i<data.size();i++) {
			driver.findElement(By.id("username")).sendKeys(data.get(i).get(0));
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(data.get(i).get(1));
			driver.findElement(By.xpath("//button[@class=\"ui button\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.xpath("//input[@id=\"password\"]")).clear();
		}
		
	}
	
	@Then("^Read the page title and confirmation message$")
	public void readPage() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id=\"action-confirmation\"]")));
		//Get the page title and heading
		String title = driver.getTitle();
		String text = driver.findElement(By.xpath("//div[@id=\"action-confirmation\"]")).getText();
		//Print the page title and heading
		System.out.println("Page Title: "+title);
		System.out.println("Login Message: "+text);
		//Assertion
		Assert.assertEquals(text, "Welcome Back, admin");
	}
	
	@And("^Close the Browser$")
	public void logout() {
		driver.close();
	}

	public LoginTestSteps() {
		// TODO Auto-generated constructor stub
	}

}
