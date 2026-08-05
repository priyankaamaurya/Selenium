package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement hr = driver.findElement(By.xpath("//a[@href='/computers']"));
		WebElement d = driver.findElement(By.xpath("//a[@href='/desktops']"));

		Actions act = new Actions(driver);
		act.moveToElement(hr).moveToElement(d).click().perform();
		
	}

}
