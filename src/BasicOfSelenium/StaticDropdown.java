package BasicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Site title :"+d.getTitle());
		Select s=new Select(d.findElement(By.id("dropdown-class-example")));
		s.selectByValue("option2");
		Thread.sleep(2000);
		s.selectByIndex(3);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Select s1=new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		s1.selectByVisibleText("USD");
		s1.deselectByValue("USD");

	}

}
