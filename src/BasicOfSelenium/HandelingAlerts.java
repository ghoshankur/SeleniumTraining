package BasicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        d.findElement(By.id("name")).sendKeys("Ankur");
        d.findElement(By.cssSelector("[id='alertbtn']")).click();
        System.out.println(d.switchTo().alert().getText());
        d.switchTo().alert().accept();
        
        //Confirm alert handling
        d.findElement(By.id("name")).sendKeys("Ankur");
        d.findElement(By.cssSelector("[id='confirmbtn']")).click();
        System.out.println(d.switchTo().alert().getText());
        d.switchTo().alert().dismiss();
        
        
	}

}
