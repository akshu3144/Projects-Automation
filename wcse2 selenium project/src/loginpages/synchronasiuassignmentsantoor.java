package loginpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchronasiuassignmentsantoor {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver  driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shoppersstack.com/");
	
	driver.manage().window().maximize();	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath(null));
	
	
	
	
	
}
}