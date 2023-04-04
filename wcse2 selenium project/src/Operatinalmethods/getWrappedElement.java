package Operatinalmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElement {
	public static void main(String[] args) {
		 System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("file:///C:/Users/hp/OneDrive/Desktop/selenium%20data2/WebElement/WebElement/dropdown%20dynamic.html");
		    
		    WebElement dropDownElement = driver.findElement(By.id("i1"));
		      
		    Select Sel = new Select(dropDownElement);
		     
		     
             WebElement Value = Sel.getWrappedElement();
             
             String Opetions = Value.getText();
		     
		     System.out.println(Opetions);
		     
		     
		     
		          
		     
		     
		     
		     
		     
		     
}
}