package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpathshine {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://www.shine.com/registration/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("Admin");
	driver.findElement(By.id("id_email")).sendKeys("Admin@23456");
	driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("123456789");
	driver.findElement(By.id("registerButton")).click();
	
	
	
	
	
	
	
}
}
