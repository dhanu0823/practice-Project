package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Userisablepageobj {
public WebDriver driver;
	
 By menubar = By.id("react-burger-menu-btn");
 By about = By.id("about_sidebar_link");
 By contact = By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[1]/li[6]/div[1]/div");
public Userisablepageobj (WebDriver driver) {
 this.driver = driver;                            }
public void clickmenubar()                  {
 driver.findElement (menubar).click();            }
public void clickabout()                    {
 driver.findElement (about).click();              }
public void  checkcontact()                 {	
	WebElement swag = driver.findElement(contact);
	Actions con = new Actions(driver);
	con.moveToElement(swag);
}      }


