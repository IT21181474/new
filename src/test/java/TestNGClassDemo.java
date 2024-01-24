

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGClassDemo {
	WebDriver driver;
  @Test
  
  public void TestGoogle() {
      String url="https://www.google.com";
	  String expected="Google";
	  driver.get(url);
	  String actual=driver.getTitle();
	  Assert.assertEquals(actual,expected);
	  
  }
  @Test
  public void TestGoogle1() {
      String url="https://www.google.com";
	  String expected="Google1";
	  driver.get(url);
	  String actual=driver.getTitle();
	  Assert.assertEquals(actual,expected);
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void setup() {
//	  System.setProperty("webdriver.chrome.driver", "F:\\TestNGDemo\\chromedriver-win64\\chromedriver.exe");
//	  driver=new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver", "F:\\TestNGDemo\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  driver=new ChromeDriver(options);
	  //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  

  }

  @AfterTest
  public void tearDown() {
	  driver.close();
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
