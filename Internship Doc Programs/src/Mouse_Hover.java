	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Mouse_Hover  {

	public static void main(String[] args) throws IOException, InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				   
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in");
							
				//MouseHover functions
			   Actions action=new Actions(driver);
			   action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"))).build().perform();
			   Thread.sleep(2000);
		      driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		      Thread.sleep(3000);
			  driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("urphoneno");
			  Thread.sleep(3000);
			  driver.findElement(By.xpath(".//*[@id='continue']")).click();
	}
	}


