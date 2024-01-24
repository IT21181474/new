package screenshot;


import org.testng.ITestListener;
import org.testng.ITestResult;


import org.testng.annotations.Test;

public class listerClass extends BaseClass implements ITestListener{
	
  @Test
  public void onTestFailure(ITestResult result) {
	  System.out.println("Test is failed");
	  try {
		  captureScreenshot(result.getName());
		  
		  
	  }
	  catch(Exception e) {
		  e.getMessage();
	  }
  }
  
  
  
}
