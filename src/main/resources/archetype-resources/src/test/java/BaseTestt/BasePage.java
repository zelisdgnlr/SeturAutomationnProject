package BaseTest; 
 
import org.openqa.selenium.*; 
import org.openqa.selenium.interactions.Actions; 
import org.openqa.selenium.support.ui.Select; 
 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Random; 
 
public class BasePage { 
    WebDriver driver; 
 
    public BasePage(WebDriver webDriver){ 
        driver=webDriver; 
    } 
    protected WebElement findElement(By by){ 
        WebElement element=driver.findElement(by); 
        return element; 
    } 
    protected void click(By by){ 
        try { 
            WebElement element=findElement(by); 
            element.click(); 
            System.out.println(by.toString()+ " elementine tıklandı."); 
        }catch (Exception e){ 
            System.out.println(by.toString()+ " elementine tıklanamadı."); 
        } 
    } 
    protected void write(By by,String text){ 
        try { 
            WebElement element=findElement(by); 
            element.sendKeys(text); 
            System.out.println(by.toString()+ " elementine "+text+" değeri yazıldı."); 
        }catch (Exception e){ 
            System.out.println(by.toString()+ " elementine "+text+" değeri yazılamadı."); 
        } 
    } 
    protected String getElementText(By by){ 
        String elementText=findElement(by).getText(); 
        return elementText; 
    } 
    protected void ENTER(By by){ 
        findElement(by).sendKeys(Keys.ENTER); 
    } 
    protected int getRandomNumber(int limit){ 
        Random random=new Random(); 
        int randomNumber=random.nextInt(limit); 
        return randomNumber; 
    } 
    public String getPageTitle(){ 
        return driver.getTitle(); 
    } 
    public void waitSecond(int seconds) { 
        try { 
            Thread.sleep(seconds * 1000); 
        }catch (Exception e){ 
            System.out.println(" saniye beklenemiyor "); 
        } 
    } 
    public void pageScrollDown(){ 
        JavascriptExecutor js = (JavascriptExecutor) driver; 
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
    } 
    public void pageScrollDownClick(By by){ 
        WebElement element = driver.findElement(by); 
        Actions actions = new Actions(driver); 
        actions.moveToElement(element); 
        actions.perform(); 
    } 
    public WebElement getRandomElementFromElementList(By by){ 
        List<WebElement> elementList=driver.findElements(by); 
        int randomNumber=getRandomNumber(elementList.size()); 
        return  elementList.get(randomNumber); 
    } 
    public void selectOption(By by,String value){ 
        Select select=new Select(driver.findElement(by)); 
        select.selectByValue(value); 
    } 
 
}