import org.testng.annotations.Test;

public class NewTest {
  
  @Test(dataProvider="dpdemo",dataProviderClass=DataProviderTest.class)
  public void testMethod(String str) {
	  System.out.println("data:"+str);
  }
}
