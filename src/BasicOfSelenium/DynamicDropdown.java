
package BasicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();

		d.get("https://www.spicejet.com/");
		d.getTitle();
		//Auto suggestive/Dynamic drop down==========================================================================
		//select departure city as Bangalore
		d.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		d.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		Thread.sleep(2000);
		//select arrival city as Chennai
		d.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Chennai (MAA)')]")).click();
		//select date as 25th feb
		d.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'27')]")).click();
		//Auto suggestive/Dynamic dropdown end=======================================================================
		//Static drop down+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		d.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		//select 2 adults as passenger
		Select s2=new Select(d.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		Thread.sleep(2000);
		s2.selectByValue("2");
		d.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		Thread.sleep(2000);
		//Select USD as currency
		Select s1=new Select(d.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		s1.selectByVisibleText("USD");
		//Static dropdown end++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		d.findElement(By.id("flightSearchContainer")).click();
		
		
		d.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();//click on one way trip
		
		d.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();//click on search button
		
	}

}


