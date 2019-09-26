package pk1.Mavenpro2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class Demo1 
    
{
	 private WebDriver driver;	
	 private static String driverPath = "D:\\TEST TOOLS\\WebDriver\\";
	 
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
		  driver = new FirefoxDriver();  
	  }

	  @AfterTest
	  public void afterTest() {driver.quit();		
	  }
  @Test
  public void  testEasy() {
	  driver.get("https://www.google.com");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Google"));
  }
  
  @Test
  public void  testEasy2() {
	  String title = driver.getTitle();	
		Assert.assertTrue(title.contains("google"));
  }
}
