package TestCases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import JavaUtilities.Dataprovider01;
import pageobjects.Purchasepageobj;
public class TC_10 {
 @Test (dataProvider = "purchase",dataProviderClass = Dataprovider01.class )
 public void purchase1(String username, String password, String firstname, String lastname,
		 String postalcode) throws InterruptedException {
//	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\nanaboina.dhanush\\Downloads\\"
 		+ "chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	     driver.get("https://www.saucedemo.com/");
	     driver.manage().window().maximize();
	     System.out.println("Title is:"+driver.getTitle());
	   	driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("user-name")).sendKeys(username);
			Thread.sleep(2000);			
			driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click(); 
			Thread.sleep(2000);
			Purchasepageobj obj = new Purchasepageobj(driver);
		       obj.clickItem();
		   	Thread.sleep(2000);
		       obj.clickAddtocart();
		   	Thread.sleep(2000);
		       obj.clickContainer();
		   	Thread.sleep(2000);
		       obj.clickCheckout();
		   	Thread.sleep(2000);
		       obj.setTextInfirstname(firstname);
		   	Thread.sleep(2000);
		       obj.setTextInlastname(lastname);
		   	Thread.sleep(2000);
		       obj.setTextInpostalcode(postalcode);
		   	Thread.sleep(2000);
		       obj.clickContinuebutton();
		   	Thread.sleep(2000);
		       obj.clickfinish();
		   	Thread.sleep(2000);
		       obj.clickBacktoproducts1();
		       String title = driver.getTitle();
	 ExtentReports extent=new ExtentReports();
	ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\nanaboina.dhanush\\eclipse-workspace1"
			+ "\\SwaglabsAuto\\report1.html");
	extent.attachReporter(spark);
	ExtentTest test=extent.createTest("Verify the purchase module");
			if(title.equals("Swag Labs")) {
				test.pass("Valid Checkout info is given as expected");	  		}
			else
			  	{    test.fail("Invalid Checkout info");			  					 }
			  	extent.flush();

	                              }                   }
