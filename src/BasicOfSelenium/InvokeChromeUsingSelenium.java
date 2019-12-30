package BasicOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChromeUsingSelenium {

	public static void main(String[] args) {
			
		//1) we will strictly impliment method of webdriver
		//2) Invoke .exe file 
		//3) Create the Driver object for the browser you want to invoke
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String passingURL="https://app03.mydbsync.com/appcenter/login";
		driver.get("https://app03.mydbsync.com/appcenter/login");
		System.out.println("Site title "+driver.getTitle());
		String rcvURL=driver.getCurrentUrl();
		ValidateURL v=new ValidateURL();
		v.validateURL(passingURL,rcvURL);
		System.out.println("Hitting URL "+driver.getCurrentUrl());
		System.out.println("Page source: \n"+driver.getPageSource());
		driver.get("http://www.mydbsync.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.mydbsync.com/blogs/");
		driver.close();

	}

}
