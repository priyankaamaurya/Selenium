package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("cat");
		
		driver.findElement(By.name("q")).clear();
		
		driver.findElement(By.name("q")).sendKeys("rabbit");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.quit();
		
		
		
		
		
	}
}
