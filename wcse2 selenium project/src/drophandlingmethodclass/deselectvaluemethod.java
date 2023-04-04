package drophandlingmethodclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectvaluemethod {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/hp/OneDrive/Desktop/selenium%20data2/Multiselectdropdown%20(1).html");
	
	WebElement dropDownElement = driver.findElement(By.id("i1"));
	
	
	Select Sel = new Select(dropDownElement);
	
	
	
	
	
	
	
}
}
