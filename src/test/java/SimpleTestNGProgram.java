import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SimpleTestNGProgram {
	WebDriver driver;
  @Test
  public void titleTest() {
	  String title=driver.getTitle();
	  System.out.println("Title of the Page :"+title);
	  
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
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  

  }

  @AfterTest
  public void tearDown() {
//	  driver.close();
  }

  



  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
