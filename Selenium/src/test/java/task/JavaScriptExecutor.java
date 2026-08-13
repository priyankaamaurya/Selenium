package task;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('twotabsearchtextbox').value='mobiles';");
		
		js.executeScript("document.getElementById('nav-search-submit-button').click();");
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector(\"div[class='a-section a-spacing-base desktop-grid-content-view'] h2[aria-label='Samsung Galaxy S26 Ultra, Unlocked Android Smartphone, 512GB, Black | Privacy Display, Galaxy AI, AI Camera, Super Fast Charging 3.0, Durable Battery, 2026, US 1 Year Warranty']\").click();");
		
		Thread.sleep(3000);
		
		for(String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
		
		Thread.sleep(3000);
		
		js.executeScript("document.getElementById('add-to-cart-button').click()");
		
		System.out.println("Product added to cart");
	}

} 
