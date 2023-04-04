package Operatinalmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOpetions {
 public static void main(String[] args) {
	 System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	    
	 
	    ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

	 
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("file:///C:/Users/hp/OneDrive/Desktop/selenium%20data2/WebElement/WebElement/dropdown%20dynamic.html");
	    
	    WebElement dropDownElement = driver.findElement(By.id("i1"));
	      
	    Select Sel = new Select(dropDownElement);
	     for(int i=0; i<4; i++)
	     {
	    	 Sel.selectByIndex(i);
	    	
	     }
	    
	   List<WebElement> allOps = Sel.getAllSelectedOptions();
	   
	   
	   for(WebElement we:allOps)
	   {
		   String Opetions = we.getText();
		   System.out.println(Opetions);
	   }
	    
	    
	    
	    
	    
}
}
