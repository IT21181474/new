package kapruka.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class kaprukaTest {
	WebDriver driver;

  @Test
  public void Register() {
	  driver.get("https://www.kapruka.com/shops/customerAccounts/accountLogin.jsp");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/button")).click();
	  driver.findElement(By.name("firstName")).sendKeys("test");
	  driver.findElement(By.name("lastName")).sendKeys("test");
	  driver.findElement(By.name("email")).sendKeys("80@mail.com");
	  driver.findElement(By.name("password")).sendKeys("test");
	  driver.findElement(By.name("passwordReConfirm")).sendKeys("test");
	  driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	  driver.findElement(By.className("btn-primary")).click();


  }
  @Test
  public void systemTest() {
//	  https://www.kapruka.com/srilanka_online_shopping.jsp?d=ducky
	  driver.get("https://www.kapruka.com/srilanka_online_shopping.jsp?d=ducky");
	  driver.findElement(By.className("catalogueV2Button")).click();
	  driver.findElement(By.id("addtocartbutton")).click();
	  
	  System.out.println(driver.getCurrentUrl());
	  

	  
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void setup() {
      System.setProperty("webdriver.chrome.driver", "F:\\TestNGDemo\\chromedriver-win64\\chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(options);
      
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
