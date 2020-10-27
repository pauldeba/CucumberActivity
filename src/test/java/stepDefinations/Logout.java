package stepDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Then;

public class Logout extends Setup {
	
	public Logout() {
		//constructor
	}
	
	@Then("^Click$")
	public void addClick() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Computers")));
		driver.findElement(By.linkText("Computers")).click();
		Thread.sleep(5000);
		System.out.println("Clicked on Computer Link");
	}
	
	@Then("^Logout$")
	public void closeBrowser() {
		driver.close();
	}

}
