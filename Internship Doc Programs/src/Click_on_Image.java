import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_on_Image {
	    public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		   
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/");
	
//Clicking on Image
        driver.findElement(By.xpath("//img[@id='enterimg']")).click();
        Thread.sleep(2000);
        
//Click on next image
        driver.findElement(By.xpath("//a[@class='navbar-brand']//img")).click();
        Thread.sleep(2000);

}
}