package BasicOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeIEUsingSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://app03.mydbsync.com/appcenter/login");
		System.out.println("Site title "+driver.getTitle());

	}

}
