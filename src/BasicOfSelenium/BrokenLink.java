package BasicOfSelenium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// Find the broken links in a website
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\AVANKIA175\\Downloads\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("http://www.mydbsync.com/");
		System.out.println("Current URL"+d.getCurrentUrl());
		System.out.println("Page title "+d.getTitle());
		//List all the links and images
		List<WebElement> linklist=d.findElements(By.tagName("a"));
		linklist.addAll(d.findElements(By.tagName("img")));
		
		System.out.println("Size of all links : "+linklist.size());
		
		List<WebElement> activeLink=new ArrayList<WebElement>();
		//Iterate linklist: exclude links which doesn't have href
		for(int i=0;i<linklist.size();i++)
		{
			System.out.println(linklist.get(i).getAttribute("href"));
			if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("javascript")))
			{
				activeLink.add(linklist.get(i));
			}
		}
		
		System.out.println("Size of active links : "+activeLink.size());
		//Check href url with httpconnection api
		
		for(int j=0;j<activeLink.size();j++)
		{
			HttpURLConnection httpcon =(HttpURLConnection)new URL(activeLink.get(j).getAttribute("href")).openConnection();
			httpcon.connect();
			String response= httpcon.getResponseMessage();
			httpcon.disconnect();
			System.out.println(activeLink.get(j).getAttribute("href")+"------------->"+response);
		}

	}

}
