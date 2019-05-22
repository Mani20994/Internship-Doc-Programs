import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_event {

	   public static void main(String[] args) throws InterruptedException {		
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
		   
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com");
    
//Using SPACE keyword
    driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Anam");
    Thread.sleep(2000);
    Actions act = new Actions(driver);
    act.sendKeys(Keys.SPACE).perform();
    Thread.sleep(2000);
    
//Using BACKSPACE Keyword
    driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Khan");
    Thread.sleep(2000);
    Actions act1 = new Actions(driver);
    act1.sendKeys(Keys.BACK_SPACE).perform();
    Thread.sleep(2000);
  
  //Using RETUEN/ENTER,TAB Keyword
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Testing");
    Thread.sleep(2000);
    Actions act11 = new Actions(driver);
    Thread.sleep(2000);
    act11.sendKeys(Keys.TAB).perform();
    Thread.sleep(2000);
    act11.sendKeys("Hello").perform();
    Thread.sleep(2000);
    act11.sendKeys(Keys.RETURN).perform();
  
    }
}

