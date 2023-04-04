package drophandlingmethodclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexmethod {
  

public static void main(String[] args) throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/selenium%20data2/WebElement/WebElement/dropdown.html");
		
           WebElement dropDownElement = driver.findElement(By.name("menu"));
		
		
		Select Sel = new Select(dropDownElement);
		
		for(int i=0;i<9;i++)
		{
			Sel.selectByIndex(i);
			Thread.sleep(2000);
		}
			
			
			
}
}
