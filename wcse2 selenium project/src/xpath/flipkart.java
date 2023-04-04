package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	private static final By By = null;

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        
        driver.findElement(By.xpath("//button[.='✕']")).click();
        
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
        
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath(""))
       
	
	}

}     		
        
        
        
        
     	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	