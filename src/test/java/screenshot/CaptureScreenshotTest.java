package screenshot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CaptureScreenshotTest {
	WebDriver driver;

  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\TestNGDemo\\chromedriver-win64\\chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.facebook.com/");
      
  
  //Capture Full Screenshot
  TakeScreenshot tc=(TakeScreenshot)driver;
  }
  
}
