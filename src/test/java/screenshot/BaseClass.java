package screenshot;

import java.io.File;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "F:\\TestNGDemo\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.youtube.com");
    }

  @Test
  public void captureScreenshot(String methodname) {
	  
	  
		    Date d = new Date();
		    String timestamp = d.toString().replace(":", "_").replace(" ", "");
		    try {
		     File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     FileUtils.copyFile(file, new File("C:\\SDETADDA\\"+methodname+timestamp+".jpg"));
		    }
		    catch (Exception e) {
		   e.getMessage();// TODO: handle exception
		  }
		   }
		}

