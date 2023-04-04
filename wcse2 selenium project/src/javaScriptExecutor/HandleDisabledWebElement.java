package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("file:///C:/Users/hp/OneDrive/Desktop/selenium%20data2/WebElement/WebElement/disbledwebelement.html");
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  Thread.sleep(2000);
	  
	  
	  
	  
	  
	  
	  
}
}
