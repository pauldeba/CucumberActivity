package stepDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefinitions.Test;

public class CallPackage extends Test{
		//WebDriver driver;
	public CallPackage() {
		// TODO Auto-generated constructor stub
	}
	
	public static void login() {
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
	}

	public static void main(String[] args) {
		CallPackage.m1();
		login();
	}
	
	protected class mmFive{
		
	}

}
