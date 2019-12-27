package BasicOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChromeUsingSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) we will strictly impliment method of webdriver
		//2) Invoke .exe file 
		//3) Create the Driver object for the browser you want to invoke
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://app03.mydbsync.com/appcenter/login");
		System.out.println("Site title "+driver.getTitle());

	}

}
