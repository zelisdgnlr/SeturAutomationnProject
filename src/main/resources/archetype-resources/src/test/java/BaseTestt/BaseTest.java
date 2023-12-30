package BaseTest; 
 
import org.junit.After; 
import org.junit.Before; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions; 
 
public class BaseTest { 
    public WebDriver driver; 
 
    @Before 
    public void start(){ 
        System.setProperty("webdriver.chrome.driver","driver/chromedriver"); 
        ChromeOptions options=new ChromeOptions(); 
        options.addArguments("--kiosk"); 
        options.addArguments("--disable-notifications"); 
        options.addArguments("--start-fullscreen"); 
        driver=new ChromeDriver(options); 
        driver.manage().window().maximize(); 
        driver.get("https://www.setur.com/"); 
    } 
 
    @After 
    public void closeBrowser(){ 
        driver.quit(); 
 
    } 
}