package datadrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import keyWordDrivenFramework.Flib;

public class ActiTimeinvalidTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=zq8gq9jdkw67\r\n");

		Flib flib = new Flib();

		int rc = flib.rowCount("./data/ActiTimeTestData.xlsx","invalidcreds");

		for(int i=1;i<=rc;i++)
		{
		String invalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds",i, 0);
		String invalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds",i, 1);
		
		driver.findElement(By.name("username")).sendKeys(invalidUsername);
		driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
		}
		driver.close();
	}

}