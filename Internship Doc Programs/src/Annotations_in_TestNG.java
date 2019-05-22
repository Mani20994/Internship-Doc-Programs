
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_in_TestNG {

 public static WebDriver driver;

 @Test(priority = 2)
 public void addition() {
 }

 @Test(priority = 1)
 public void subtraction1() {
 }

 @Test(priority = 0)
 public void multiply() {
 }

 @BeforeMethod
 public void beforeMethod() {
 }

 @AfterMethod
 public void afterMethod() {
 }
}

