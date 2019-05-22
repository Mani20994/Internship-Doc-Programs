import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("https://www.demo.iscripts.com/netmenus/mrml/cms");	
	
//login 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		
//click on restaurant
		driver.findElement(By.xpath("//li[6]//a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
		
//Drop down by index value
		driver.findElement(By.xpath("//select[@id='created_by']/option[2]")).click();
		Thread.sleep(2000);
		
//Drop down by sendkeys value
		driver.findElement(By.xpath("//select[@id='delivery_fee_type']")).sendKeys("Flat");
		
		
		
		
}
}