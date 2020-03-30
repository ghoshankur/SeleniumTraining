package BasicOfSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		String[] veg={"Mango","Brocolli","Apple","Raspberry","Nuts Mixture"};
		d.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(3000);
		
		int j=0;
		
		List<WebElement> products=d.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{  
		List<String> ItemsNeeded = Arrays.asList(veg);
			
		String[] s =products.get(i).getText().split("-");
		String s1=s[0].trim();
		
	try{
		
		if(ItemsNeeded.contains(s1))
			{
				d.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			   j++;
			  
			}
		if(j==veg.length)
			
			break;
		}
	
		catch(IndexOutOfBoundsException  e)
		{
			System.out.println(e);
		}
	
	}
	}
}
