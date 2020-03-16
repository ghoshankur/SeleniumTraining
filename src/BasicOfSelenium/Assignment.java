package BasicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
/*https://www.cleartrip.com/
select adult
select children
select today's date in departure.
click on the link 
enter airlines name 
click on search
grab the error message
*/

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();

		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.getTitle();
		d.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertTrue(d.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		System.out.println(d.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		d.findElement(By.cssSelector("input[type='checkbox']")).getSize();
		System.out.println(d.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(d.findElements(By.cssSelector("input[type='checkbox']")).size(), 3);
		



	}

}
