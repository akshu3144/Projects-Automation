

	package Locators;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class namelocator {
	
       public static void main(String[] args) throws InterruptedException {
	 
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/hp/OneDrive/Desktop/selenium%20data2/username.html");
			Thread.sleep(2000);
			driver.findElement(By.tagName("input")).sendKeys("admin");
			Thread.sleep(2000);
			driver.navigate().to("file:///C:/Users/hp/OneDrive/Desktop/selenium%20data2/Password.html");
			driver.findElement(By.id("i1")).sendKeys("Manager");
			
	 }
}
