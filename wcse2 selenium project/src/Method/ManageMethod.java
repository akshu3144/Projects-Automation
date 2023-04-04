package Method;


	
	import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ManageMethod  {
	  public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("apple",Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(2000);
		Dimension targetSize =new Dimension(770,575);
		driver.manage().window().setSize(targetSize);
		driver.close();
	  }
	}