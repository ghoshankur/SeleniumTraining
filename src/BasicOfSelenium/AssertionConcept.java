package BasicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssertionConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();

		d.get("https://www.spicejet.com/");
		d.getTitle();
		//Using Assert function to check if a condition is true or false for checkbox for validation
		Assert.assertFalse(d.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		System.out.println(d.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

		System.out.println(d.findElements(By.cssSelector("input[type='checkbox']")).size());
		d.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

		Assert.assertTrue(d.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		System.out.println(d.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Thread.sleep(2000);
		//Auto suggestive/Dynamic drop down==========================================================================
		//select departure city as Bangalore
		d.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		d.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		Thread.sleep(2000);
		//select arrival city as Chennai
		d.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Chennai (MAA)')]")).click();
		//Select current date
		d.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//select date as 25th feb
		//d.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'27')]")).click();
		//Auto suggestive/Dynamic dropdown end=======================================================================
		//Static drop down+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		d.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		//select 2 adults as passenger
		Select s2=new Select(d.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		Thread.sleep(2000);
		s2.selectByValue("2");
		d.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		Thread.sleep(2000);
		Assert.assertEquals(d.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(),"2 Adult");
		System.out.println(d.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		//Select USD as currency
		Select s1=new Select(d.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		s1.selectByVisibleText("USD");
		//Static dropdown end++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Using assertion to validate if the date field is enabled or not
		//Assert.assertFalse(d.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		//using condition to check if radio button for return is selected or not
		System.out.println(d.findElement(By.id("Div1")).getAttribute("style"));
		if(d.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		//d.findElement(By.id("flightSearchContainer")).click();
		
		//click on one way trip
		//d.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();

		//click on search button

		d.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();		
	}

}



