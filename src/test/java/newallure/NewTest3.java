package newallure;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest3 {
  @Test
  public void testMethod3() {
	  throw new SkipException("testMethod3 will be skipped");
  }
  @Test
  public void testMethod4() {
	  throw new SkipException("testMethod4 will be skipped");
  }
}
