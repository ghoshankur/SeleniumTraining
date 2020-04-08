package BasicOfSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddingItemToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AVANKIA175\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		String[] veg = { "Mango", "Brocolli", "Apple", "Raspberry", "Nuts Mixture" };
		d.get("https://rahulshettyacademy.com/seleniumPractise/");
		// Implicit wait.
		//d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//explicit wait declaration
		
		addItems(d, veg);
		checkout(d);

	}

	private static void checkout(WebDriver d) throws InterruptedException {
		WebDriverWait w=new WebDriverWait(d,5);
		d.findElement(By.cssSelector("img[alt='Cart']")).click();
		d.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		d.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		d.findElement(By.xpath("//button[@class='promoBtn']")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		//Assert.assertEquals(d.findElement(By.xpath("//span[@class='promoInfo']")).getText(), "Code applied ..!");
		d.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(d.findElement(By.xpath("//span[@class='promoInfo']")).getText());

	}

	public static void addItems(WebDriver d, String[] veg) {
		int j = 0;
		List<WebElement> products = d.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			List<String> ItemsNeeded = Arrays.asList(veg);

			String[] s = products.get(i).getText().split("-");
			String s1 = s[0].trim();

			try {

				if (ItemsNeeded.contains(s1)) {
					d.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					j++;

				}
				if (j == veg.length)

					break;
			}

			catch (IndexOutOfBoundsException e) {
				System.out.println(e);
			}

		}

	}
}
