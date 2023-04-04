package Operatinalmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsmultipleMethod {
  public static void main(String[] args, WebElement dropDownElemnt) throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/hp/OneDrive/Desktop/selenium%20data2/WebElement/WebElement/dropdown%20dynamic.html"
			+ ""
			+ "");
	
	WebElement dropDownElement = driver.findElement(By.id("i1"));
	 
	Select Sel1 = new Select(dropDownElemnt);
	
	System.out.println(Sel1.isMultiple());
	
	Thread.sleep(2000);
	
	driver.navigate().to("file:///C:/Users/hp/OneDrive/Desktop/selenium%20data2/WebElement/WebElement/dropdown%20dynamic.html");
	     WebElement dropDownElement1 = driver.findElement(By.id("i1"));
	
	Select Sel11= new Select(dropDownElement);
	System.out.println(Sel11.isMultiple());
	
	
	
	
	
	
	
}
}
