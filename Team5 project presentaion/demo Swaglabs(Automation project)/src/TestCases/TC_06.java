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
import pageobjects.Productcatologpageobj;
public class TC_06 {
 @Test (dataProvider = "signing",dataProviderClass = Dataprovider01.class )
 public void Productcatolog3(String username, String password) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\nanaboina.dhanush\\Downloads\\"
 		+ "chromedriver_win32\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.saucedemo.com");
 driver.manage().window().maximize();
 System.out.println("Title is:"+driver.getTitle());
 driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
 driver.findElement(By.id("user-name")).sendKeys(username);	
 Thread.sleep(2000);
 driver.findElement(By.id("password")).sendKeys(password);
 Thread.sleep(2000);
 driver.findElement(By.id("login-button")).click(); 
 Thread.sleep(2000);
 Productcatologpageobj obj = new Productcatologpageobj(driver);
 obj.clickproduct_sort_container();
 Thread.sleep(2000);	  
 obj.clickoption3();
 Thread.sleep(2000);
 String title = driver.getTitle();
 ExtentReports extent=new ExtentReports();
 ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\nanaboina.dhanush\\eclipse-workspace1"
 		+ "\\SwaglabsAuto\\report1.html");
 extent.attachReporter(spark);
 ExtentTest test=extent.createTest("Verify the product catalog module");
if(title.equals("Swag Labs")) {
	test.pass("productcatalog Price Low to High");	  		}
else
	{test.fail("process failed"); 			
	  		}
	  	extent.flush();
	  
	}      }
