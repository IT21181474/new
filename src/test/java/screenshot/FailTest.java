package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FailTest {
	WebDriver driver;//WebDriver,TakeScreenshot are interfaces

	@BeforeMethod
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", "F:\\TestNGDemo\\chromedriver-win64\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
	     driver.manage().window().maximize();
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	@Test
	  public void checkTitle1() throws IOException{
		 
	      driver.get("https://www.mayoclinic.org");
	      
	      String ActualWebTitle=driver.getTitle();
	      String ExpectedWebTitle="Top-ranked Hospital in the Nation - Mayo Clinic";
	      Assert.assertEquals(ActualWebTitle, ExpectedWebTitle);
	      
//	    //Capture Full Screenshot
//	      File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	      Files.copy(f, new File("F:\\TestNGDemo\\Screenshot\\amazonscreenshot.jpg"));
	      
	      
	     
	  }
	
	@Test
	  public void checkTitle2() throws IOException{
		 
	      driver.get("https://www.mayoclinic.org");
	      
	      String ActualWebTitle=driver.getTitle();
	      String ExpectedWebTitle="Top-ranked Hospital in the Nation- Mayo Clinic";
	      Assert.assertEquals(ActualWebTitle, ExpectedWebTitle);
	      
//	    //Capture Full Screenshot
//	      File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	      Files.copy(f, new File("F:\\TestNGDemo\\Screenshot\\amazonscreenshot.jpg"));
	      
	      
	     
	  }
	  
	  
	  
	  @AfterMethod
	  public void afterMethod(ITestResult result) throws IOException {
		  String MethodName=result.getMethod().getMethodName();
		  System.out.println("Test name : "+MethodName);
		  Date currentdate=new Date();
		  System.out.println(currentdate);
		  String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
		  
		  
		  if(ITestResult.SUCCESS==result.getStatus()) {
			  

			  TakesScreenshot ts=(TakesScreenshot)driver;
		      File src=ts.getScreenshotAs(OutputType.FILE);
		      File trg=new File(".//Screenshot//success "+screenshotfilename+".png");
		      FileUtils.copyFile(src, trg);
		      System.out.println("The test case is passed");
		      
			  
		  }else if(ITestResult.FAILURE==result.getStatus()){
			  
			  
			  TakesScreenshot ts=(TakesScreenshot)driver;
		      File src=ts.getScreenshotAs(OutputType.FILE);
		      File trg=new File(".//Screenshot//fail "+screenshotfilename+".png");
		      FileUtils.copyFile(src, trg);
		      System.out.println("The test case is fail");

		  }
		  
		  driver.quit();
	  }
}
