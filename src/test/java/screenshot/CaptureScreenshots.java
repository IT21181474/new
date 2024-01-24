package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException{
		  
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      driver.get("https://www.facebook.com/");
	      
	    //Capture Full Screenshot
	      TakesScreenshot tc= driver;
	      File src=tc.getScreenshotAs(OutputType.FILE);
	      File location=new File(".\\Screenshot\\LoginPage.png");
	      FileUtils.copyFile(src, location);
	      
	}

}
