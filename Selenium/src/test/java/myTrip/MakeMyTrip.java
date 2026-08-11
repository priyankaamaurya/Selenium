package myTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
				
		Actions action = new Actions(driver);
		
//		action.moveByOffset(1081, 21).moveByOffset(0, 437).click().perform(); 
		
		action.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.linkText("Sell on Amazon"))).click().perform();

		
	}
		
}
