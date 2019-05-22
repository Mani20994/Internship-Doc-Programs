import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {


public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
    
 driver.manage().window().maximize();
 driver.get("https://www.crmpro.com");
 
 driver.findElement(By.name("username")).sendKeys("priya1");
 driver.findElement(By.name("password")).sendKeys("Minds123");
 Thread.sleep(3000);
 
 driver.findElement(By.xpath("//input[@value='Login']")).click();
 
  driver.switchTo().frame("mainpanel");
  
  //1.grt the list of all the links & images
  List<WebElement> linksList=driver.findElements(By.tagName("a"));
 
 linksList.addAll(driver.findElements(By.tagName("img")));
 
 
 List<WebElement> activeLinks=new ArrayList<WebElement>();
 
 System.out.println("size of full links & images"+linksList.size());
 
 //2.iterate link list:exclude all links/images-doesnt have any attribute
 for(int i=0;i<linksList.size();i++) {
  System.out.println(linksList.get(i).getAttribute("href"));
  if(linksList.get(i).getAttribute("href")!=null &&(! linksList.get(i).getAttribute("href").contains("javascript"))){
   activeLinks.add(linksList.get(i));
  
   
  } 
  
 }
 //get the size of active links list:
 System.out.println("size of active links & images"+activeLinks.size());
 
 //3.check the href url,with http connection api:
 for(int j=0;j<activeLinks.size();j++) {
  
HttpURLConnection connection=(HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection(); 
  
 connection.connect(); 
 String response=connection.getResponseMessage();//ok
 connection.disconnect();
 System.out.println(activeLinks.get(j).getAttribute("href")+"----->"+response);
 
  
 }
 
}

}
