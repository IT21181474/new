package screenshot;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(screenshot.listerClass.class)
public class TestCase1 extends BaseClass{
	@BeforeClass
    public void initialze() {
        setup();
    }
	
  @Test
  public void testMethod() {
	  driver.findElement(null);
  }
  @AfterTest
  public void tearDown() {
	  driver.close();
  }
}
