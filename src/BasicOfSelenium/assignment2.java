package BasicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.cleartrip.com/");
		d.getTitle();
		Select s=new Select(d.findElement(By.xpath("//select[@id='Adults']")));
		s.selectByValue("3");
		Select s1=new Select(d.findElement(By.xpath("//select[@id='Childrens']")));
		s1.selectByIndex(2);
		d.findElement(By.xpath("//input[@id='DepartDate']")).click();
		d.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]")).click();
		d.findElement(By.cssSelector("#MoreOptionsLink")).click();
		d.findElement(By.id("AirlineAutocomplete")).sendKeys("Lufthansa");
		d.findElement(By.id("SearchBtn")).click();
		System.out.println(d.findElement(By.id("homeErrorMessage")).getText());

	}

}
