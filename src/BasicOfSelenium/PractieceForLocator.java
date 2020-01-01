package BasicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractieceForLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://login.salesforce.com/");
		System.out.println("Web Page Title "+a.getTitle());
	    a.findElement(By.xpath("//*[@id='username']")).sendKeys("a_a@mailinator.com");
	    a.findElement(By.xpath("//*[@id='password']")).sendKeys("Avankia1");
	    a.findElement(By.xpath("//*[@id='Login']")).click();
	    System.out.println("Error "+a.findElement(By.cssSelector("#error")).getText());
	   // a.findElement(By.cssSelector("*[id='username']")).sendKeys("a_a@mailinator.com");
	    //tagName[contains(@attribute,'value')]  - xpath regular expression

	}

}
