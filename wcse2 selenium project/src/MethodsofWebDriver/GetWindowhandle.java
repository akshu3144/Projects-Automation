package MethodsofWebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("http://omayo.blogspot.com/");
	 
	 
	 Thread.sleep(2000);
	 driver.quit();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
