package pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Signingpageobj {
	public WebDriver driver;
	
	 By username = By.id("user-name");
	    By password = By.id("password");
	    By loginbutton = By.id("login-button");
	

	public Signingpageobj  (WebDriver driver) {
	this.driver = driver;
	}

	public void enterUsername(String standard_user) {
		driver.findElement (username).sendKeys(standard_user);
	    }
	
	public void enterPassword(String Text) {
		driver.findElement (password).sendKeys(Text);
	    }
	public void clickloginbutton() {
		driver.findElement (loginbutton).click();
		}
}


