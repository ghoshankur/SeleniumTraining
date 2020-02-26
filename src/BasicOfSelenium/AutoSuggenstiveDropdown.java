package BasicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggenstiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.makemytrip.com/");
		System.out.println("Current URL"+d.getCurrentUrl());
		System.out.println("Page title "+d.getTitle());
		d.findElement(By.xpath("//input[@id='fromCity']")).click();
		WebElement src=d.findElement(By.xpath("//input[@placeholder='From']"));
		src.sendKeys("BLR");
		Thread.sleep(2000);
		src.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		src.sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='toCity']")).click();
		WebElement dest=d.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(2000);
		dest.sendKeys("YTO");
		Thread.sleep(2000);
		
		for(int i=0;i<3;i++)
		{
			dest.sendKeys(Keys.ARROW_DOWN);
		}
		
		dest.sendKeys(Keys.ENTER);
		
		
		
		

	}

}