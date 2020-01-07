package BasicOfSelenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LocatorTechnique {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//Use $x("") to validate the xpath
		//Use $("") to validate cssSelector 
		d.get("https://app03.mydbsync.com/appcenter/login");
		System.out.println("Hitting URL "+d.getCurrentUrl());
		d.findElement(By.id("Email")).sendKeys("ankur.g@avankia.com");
		d.findElement(By.name("j_password")).sendKeys("Avankia1#");
		d.findElement(By.id("signIn")).click();
		
		//d.findElement(By.linkText("Forgot password?")).click();
		for(int i=0;i<7;i++){
		d.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/button[2]")).click();
		}
		d.findElement(By.cssSelector("#page-wrapper > div.row.wrapper.border-bottom.white-bg.page-heading > div.col-lg-3 > div > a")).click();
		ArrayList<String> windowHandles=new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(windowHandles.get(1));
		
		d.findElement(By.xpath("//*/table//tr[1]/td[1]/a")).click();
		d.findElement(By.xpath("//*[@id='connectors']/a/span[1]")).click();
		d.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div/div/div/div[1]/div/button")).click();
		d.findElement(By.xpath("//*[@id='cNameId']")).sendKeys("QBOSelenium");
		Select conn=new Select(d.findElement(By.id("cTypeId")));
		conn.selectByVisibleText("QuickBooks Online Rest Connector");
		d.findElement(By.xpath("//*[@id='createConnectorBox']/div/div/div[3]/button[2]")).click();
		//Select EnvQbo=new Select(d.findElement(By.id("prop_environment")));
		//EnvQbo.selectByVisibleText("Sandbox Instance");
		//d.findElement(By.xpath("//*[@id='showipp']/img")).click();


	}

}
