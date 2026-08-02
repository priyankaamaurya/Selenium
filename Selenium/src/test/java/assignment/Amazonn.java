package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonn {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		Thread.sleep(2000);
				
		System.out.println("Page Title: " + driver.getTitle());
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchBox.sendKeys("Laptop");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(2000);
		
//		WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]"));
		
	}

}
