package screenshot;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



//Take full page screenshot
public class NewTest {
	WebDriver driver;//WebDriver,TakeScreenshot are interfaces

	@BeforeClass
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", "F:\\TestNGDemo\\chromedriver-win64\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
	     driver.manage().window().maximize();
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	
	
  @Test
  public void amazonScreenshot() throws IOException{
	 
      driver.get("https://amazon.in");
      
    //Capture Full Screenshot
      File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      Files.copy(f, new File("F:\\TestNGDemo\\Screenshot\\amazonscreenshot.jpg"));
     
  }
  
  
  @Test
  public void ebayScreenshot() throws IOException{
	  Date currentdate=new Date();
	  System.out.println(currentdate);
	  String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
	  System.out.println(screenshotfilename);

	  driver.get("https://www.ebay.com.au/");
      
    //Capture Full Screenshot
      File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(f, new File(".//Screenshot/ebayscreenshot.jpg"));
      
      
      //get rid of overwritten
      FileUtils.copyFile(f, new File(".//Screenshot/ebayscreenshot - "+screenshotfilename+".jpg"));
     
     
  }
  
  
  @Test
  public void demoScreenshot() throws IOException{
	 

      driver.get("https://demo.nopcommerce.com/");
      
      //Full page screenshot
      //Remote WebDriver is a class of WebDriver
      TakesScreenshot ts=(TakesScreenshot)driver;
      File src=ts.getScreenshotAs(OutputType.FILE);
      File trg=new File(".//Screenshot//homepage.png");
      
      
      FileUtils.copyFile(src, trg);
      
         
  }
  
  
  
  @Test
  public void demoSectionScreenshot() throws IOException{
	 

      driver.get("https://demo.nopcommerce.com/");
      
    //Screenshot of section/portion of the page
      WebElement section=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
      
      File src=section.getScreenshotAs(OutputType.FILE);
      File trg=new File(".//Screenshot//fproducts.png");
      
      FileUtils.copyFile(src, trg);
      
          
  }
  
  
 
  
  
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  
}
