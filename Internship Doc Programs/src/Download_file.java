import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download_file {
	
static WebDriver driver;
public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	
	String downloadFilepath = "D:\\Download\\screenb.jpeg";
	
	//Holds the key value pair
	HashMap<String, Object> chromePref = new HashMap<String,Object>();
	chromePref.put("profile.default_content_settings.popups", 0);
	chromePref.put("download.default_directory",downloadFilepath);
	
	ChromeOptions options =new ChromeOptions();
	options.setExperimentalOption("prefs",chromePref);
	
	driver = new ChromeDriver(options);
	driver.get("https://skpatro.github.io/demo/links/");
	driver.manage().window().maximize();
	
	//Download button xpath
	driver.findElement(By.xpath("//div[@class='download']//input[@class='btn']")).click();
	Thread.sleep(2000);
}
}
