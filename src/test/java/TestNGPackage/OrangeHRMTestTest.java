package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class OrangeHRMTestTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "F:\\TestNGDemo\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void loginTest() {
//        // Wait for username field to be present and visible
//        WebElement usernameField = new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
//        // Enter username
//        usernameField.sendKeys("Admin");
        
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.name("username")).sendKeys("Admin");
        
       

//        // Wait for password field to be present and visible
//        WebElement passwordField = new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
//        // Enter password
//        passwordField.sendKeys("admin123");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.name("password")).sendKeys("admin123");

//        // Wait for login button to be present and visible
//        WebElement loginButton = new WebDriverWait(driver, 10)
//                .until(ExpectedConditions.presenceOfElementLocated(By.className("orangehrm-login-button")));
//        // Click login button
//        loginButton.click();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.className("orangehrm-login-button")).click();;
    }
    
    @Test
    public void currURLTest(){
    	String url=driver.getCurrentUrl();
    	System.out.println("URL"+url);
    }
    @Test
    public void titleTest(){
    	String title=driver.getTitle();
    	System.out.println("Title"+title);
    }
    
    @Test
       
    public void logout(){
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on the user dropdown tab
        WebElement userDropdownTab = driver.findElement(By.className("oxd-userdropdown-tab"));
        userDropdownTab.click();

       
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on the user dropdown link
        WebElement userDropdownLink = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
        userDropdownLink.click();

        // Add any additional steps for the logout process if needed
    }
    
    

    @AfterMethod
    public void afterMethod() {
        // Optionally, you can add code to navigate back to the login page or perform other cleanup.
    }

    @AfterClass
    public void afterClass() {
       driver.quit();
    }
}
