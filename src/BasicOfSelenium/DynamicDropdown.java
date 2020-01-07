package BasicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.spicejet.com/");
		System.out.println("Current URL"+d.getCurrentUrl());
		System.out.println("Page title "+d.getTitle());
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		d.findElement(By.xpath("//a[@value='BLR']")).click();
		//try catch block is for thread.sleep()
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
		d.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
//		Static dropdown code below		
//		Select s=new Select(d.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//		s.selectByValue("2");
//		d.close();

	}

}
