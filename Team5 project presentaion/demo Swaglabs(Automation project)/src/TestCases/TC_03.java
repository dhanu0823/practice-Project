package TestCases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import JavaUtilities.Dataprovider01;
import pageobjects.Signingpageobj;
public class TC_03 {
 @Test (dataProvider = "signing1", dataProviderClass = Dataprovider01.class)
 public void Logintohomepage1(String username, String password) throws InterruptedException {
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
 String message= driver.findElement(By.tagName("h3")).getText();
 System.out.println(message);
// Assert.fail("System is not accepting given valid username");
 String title = driver.getTitle();
 ExtentReports extent=new ExtentReports();
 ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\nanaboina.dhanush\\eclipse-workspace1"
			+ "\\SwaglabsAuto\\report1.html");
	extent.attachReporter(spark);
	ExtentTest test=extent.createTest("Verify the Signing module");
	if(title.equals("Swag Labs")) {
		test.pass("signing failed When valid username is given");}
	else
	{   test.fail("signing is failed");	
	}
extent.flush();

	}   }


