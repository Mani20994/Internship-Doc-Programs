import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_I_Frames {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//URL
	driver.get("https://www.dezlearn.com/testingpage/");
	Thread.sleep(2000);
	
	//switch to 1st window
	driver.switchTo().frame("contact-iframe");
	Thread.sleep(2000);
	
	//to locate to menu bar
	driver.findElement(By.xpath("html/body/div[4]/div[1]/a/i[1]")).click();
	Thread.sleep(2000);
	
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	
	//to switch another window
	driver.switchTo().frame("do-it-iframe");
		
	driver.findElement(By.xpath(".//*[@id='main']/section/div/form/label/input")).sendKeys("W3school");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='main']/section/div/form/input")).click();
	Thread.sleep(2000);
	//to  switch to parent window
	driver.switchTo().parentFrame();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@id='popup']")).click();
	Thread.sleep(4000);
	driver.quit();
	
	}
}
