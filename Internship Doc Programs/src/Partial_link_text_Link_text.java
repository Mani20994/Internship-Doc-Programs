import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_link_text_Link_text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//tr[2]//td[1]//table[1]//tbody[1]//tr[1]//td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nidhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kulkarni");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("anam123khan@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nidhu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Minds123");
		Thread.sleep(2000);
		
//Link Text
		driver.findElement(By.linkText("SIGN-ON")).click();
		Thread.sleep(2000);
		
//Partial link text
		driver.findElement(By.partialLinkText("Des")).click();
		Thread.sleep(2000);
	}	
}
