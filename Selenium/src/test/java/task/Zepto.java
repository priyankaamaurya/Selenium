package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Zepto {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
//		WebDriver dr = new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.zepto.com");
				
		driver.findElement(By.xpath("//span[text() = 'Search for']")).sendKeys("Sunflower oil");
//		driver.findElement(By.xpath("//img[@class='relative overflow-hidden min-h-[148px] min-w-[100px]']"));
		
		driver.quit();
	}

}
