import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstagramLogin {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the chromedriver executable
    	 System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
 		
  	   ChromeOptions co = new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
  		
        

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

        // Navigate to the Instagram login page
        driver.get("https://www.instagram.com/accounts/login/");

        // Find the username and password input fields
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        Thread.sleep(2000);
        // Enter your username and password
        usernameField.sendKeys("akshu3144");
        passwordField.sendKeys("123456");
        Thread.sleep(2000);
        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Wait for the user to be logged in and verify that the login was successful
        // Here you can add your own logic to check if the login was successful or not
        // For example, you can wait for the profile page to load and verify that the username is correct
        Thread.sleep(2000);
        // Close the browser
        
    }
}
