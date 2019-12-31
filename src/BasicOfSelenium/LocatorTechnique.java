package BasicOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTechnique {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//Use $x("") to validate the xpath
		//Use $("") to validate cssSelector 
		d.get("https://app03.mydbsync.com/appcenter/login");
		System.out.println("Hitting URL "+d.getCurrentUrl());
		d.findElement(By.id("Email")).sendKeys("ankur.g@avankia.com");
		d.findElement(By.name("j_password")).sendKeys("enter your password");
		d.findElement(By.id("signIn")).click();
		//d.findElement(By.linkText("Forgot password?")).click();
		for(int i=0;i<7;i++){
		d.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/button[2]")).click();
		}
		d.findElement(By.cssSelector("#page-wrapper > div.row.wrapper.border-bottom.white-bg.page-heading > div.col-lg-3 > div > a")).click();
		



	}

}
