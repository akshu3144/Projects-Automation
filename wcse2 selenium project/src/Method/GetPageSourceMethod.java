package Method;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetPageSourceMethod {
  public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	String sourceCodeofLoginpage = driver.getPageSource();
	System.out.println(sourceCodeofLoginpage);
	
}
}