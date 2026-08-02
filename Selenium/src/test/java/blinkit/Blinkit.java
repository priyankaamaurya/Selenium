package blinkit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blinkit {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.blinkit.com");
		
		driver.findElement(By.linkText("Detect my location")).click();
		
		driver.findElements(By.cssSelector("div[data-pf='reset']")).get(0).click();
		
		driver.quit();

		
	}
}
