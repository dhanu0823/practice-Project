package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productcatologpageobj {
public WebDriver driver;
	
  By product_sort_container = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
  By option1 = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[1]");
  By option2 = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]");
  By option3 = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]");
  By option4 = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]");
	public Productcatologpageobj (WebDriver driver) {
	this.driver = driver;
	}
	public void clickproduct_sort_container() {
		driver.findElement (product_sort_container).click();
	    }	
	public void clickoption1() {
		driver.findElement (option1).click();
	    }
	public void clickoption2() {
		driver.findElement (option2).click();
	    }
	public void clickoption3() {
		driver.findElement (option3).click();
	    }
	public void clickoption4() {
		driver.findElement (option4).click();
	    }	
}

