package loginpages;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eliminateduplicate1 {
   public static void main(String[] args) {
	   System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("file:///C:/Users/hp/OneDrive/Desktop/selenium%20data2/WebElement/WebElement/dropdown%20dynamic.html");
	    
	    WebElement dropDownElement = driver.findElement(By.id("i1"));
	    
	    Select Sel = new Select(dropDownElement);
	      
	    
	    HashSet<String> hs = new HashSet<String>();
	    
	    
	  List<WebElement> allOps = Sel.getOptions();
	  
	  for(int i=0; i<allOps.size(); i++)
	  {
		 WebElement opetins = allOps.get(i);
		 String text = opetins.getText();
		 hs.add(text);
		 
	  }
	    for(String Value:hs)
	    {
	    	System.out.println(Value);
	    }
	    
	   
	   
	   
	   
}
}
