package BasicOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefoxUsingSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://app03.mydbsync.com/appcenter/login");
		System.out.println("Site title "+driver.getTitle());


	}

}
