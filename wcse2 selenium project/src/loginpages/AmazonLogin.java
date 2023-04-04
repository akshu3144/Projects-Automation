package loginpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {


public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver  driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_logo%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&prevRID=1CJKBD0K8QDBV20FP4NY&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.findElement(By.id("ap_customer_name")).sendKeys("Akshay");
	Thread.sleep(3000);
	driver.findElement(By.id("ap_password")).sendKeys("123456");
	Thread.sleep(3000);
	driver.findElement(By.tagName("a-button a-button-span12 a-button-primary auth-requires-verify-modal")).click();
	
	
}
}
