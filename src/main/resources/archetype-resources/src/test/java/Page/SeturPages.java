package Page; 
 
import BaseTest.BasePage; 
import org.junit.Assert; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import static Page.Element.*; 
 
public class SeturPages extends BasePage { 
    public SeturPages(WebDriver webDriver) { 
        super(webDriver); 
    } 
 
    public static  String  productDetailPage_productPrice=""; 
 
    public void openPage() 
    { 
        Assert.assertEquals(getPageTitle(),"Setur.com "); 
    } 
    public void contentControl() 
    { 
        String myAccountButtonResult=getElementText(myAccountButton); 
        Assert.assertEquals(myAccountButtonResult,"Default"); 
        
    } 
    public void search(){ 
        write(Nereye Gideceksiniz, "Antalya"); 
        ENTER(NereyeGideceksinizEnter); 
    } 
     
public void search(){ 
        write(Tarih, "nisanin ilk haftasi"); 
        ENTER(TarihEnter); 
    } 
    public void openPage() 
    { 
        Assert.assertEquals(getPageTitle(),"search"); 
    } 
    public void contentControl() 
    { 
    public void openPage() 
    { 
        Assert.assertEquals(getPageTitle(),"Antalya "); 
    } 
    public void contentControl() 
    { 
    public void isSearchPageOpen(){ 
        waitSecond(5); 
        String NereyeGideceksiniz=getElementText(NereyeGideceksinizEnterResult); 
        Boolean isContainsNereyeGideceksiniz=NereyeGideceksiniz.contains("Antalya"); 
        Assert.assertTrue(isContainsSearchText); 
    } 
public void clickRandomProduct(){ 
        WebElement selectedProduct=getRandomDigerBölgeleriGöster(randomProduct); 
        selectedProduct.click(); 
        waitSecond(5); 
       } 
    } 
 