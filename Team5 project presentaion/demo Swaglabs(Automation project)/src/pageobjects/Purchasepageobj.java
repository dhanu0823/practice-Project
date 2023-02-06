package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Purchasepageobj {
 public WebDriver driver;
 By username = By.id("user-name");
 By password = By.id("password");
 By loginbutton = By.id("login-button");
 By item = By.xpath("//*[@id=\"item_4_img_link\"]/img");		
 By addtocart= By.id("add-to-cart-sauce-labs-backpack");
 By container= By.xpath("//*[@id=\"shopping_cart_container\"]/a");
 By checkout = By.id("checkout");
 By firstname = By.id("first-name");
 By lastname = By.id("last-name");
 By postalcode = By.id("postal-code");
 By continuebutton = By.id("continue");
 By finish = By.id("finish");
 By backtoproducts1 = By.id("back-to-products");
public Purchasepageobj(WebDriver driver) {
 this.driver = driver;    
                                         }

    public void enterUsername(String standard_user){
   	driver.findElement (username).sendKeys(standard_user); }	
	public void enterPassword(String Text)     {
	driver.findElement (password).sendKeys(Text);		   }
	public void clickloginbutton()             {
	driver.findElement (loginbutton).click();			   }
    public void clickItem()                    {
   	driver.findElement (item).click(); 	    	           }    	
	public void clickAddtocart()               {
	driver.findElement (addtocart).click();			       }		
	public void clickContainer()               {
	driver.findElement (container).click();		           }
	public void clickCheckout()                {
	driver.findElement(checkout).click();		           }
	public void setTextInfirstname(String Text){
	driver.findElement (firstname).sendKeys(Text);  	   }
	public void setTextInlastname(String Text) {
	driver.findElement (lastname).sendKeys(Text);	       }
	public void setTextInpostalcode(String Text){
	driver.findElement (postalcode).sendKeys(Text);		   }
	public void clickContinuebutton()          {
	driver.findElement (continuebutton).click();		   }
	public void clickfinish()                  {
	driver.findElement (finish).click();		           }
	public void clickBacktoproducts1()         {
	driver.findElement (backtoproducts1).click();	  }	   }


