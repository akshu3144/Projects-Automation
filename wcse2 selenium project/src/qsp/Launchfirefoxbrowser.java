package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefoxbrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.geckodriver.drivers","./drivergeckodriver.exe");
	new FirefoxDriver();

}
}
