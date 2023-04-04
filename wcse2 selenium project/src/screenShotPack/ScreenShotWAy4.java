package screenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotWAy4 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev");
		
		// way 4 create the obj of EventFiringWebDriver (C)
		
		           EventFiringWebDriver evf = new EventFiringWebDriver(driver);
		           File src = evf.getScreenshotAs(OutputType.FILE);
		           File dest = new File("./ScreenShots/ssWay4.png");
		           
		           Files.copy(src, dest);
	}

}