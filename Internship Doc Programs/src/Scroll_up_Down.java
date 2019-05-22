import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll_up_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Anam");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Khan");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("anam123khan@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).sendKeys("anam123khan@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("123anam");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='day']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='day']/option[13]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='month']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='month']/option[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='year']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='year']/option[29]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='u_0_z']/span[1]/label")).click();
		
		//Scroll Down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		System.out.println("scrolled Down");
		Thread.sleep(3000);
		
	
		//Scroll up
		js.executeScript("window.scrollBy(2500,-2500)");
		System.out.println("scrolled up");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anam123khan@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123anam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_0_8']")).click();
		
		
	}

}
