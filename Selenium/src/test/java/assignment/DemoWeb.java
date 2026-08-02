package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value = 'Search']/preceding-sibling::input")).click();
		
		driver.get("https://www.blinkit.com");
		driver.findElement(By.xpath("//div[text() = 'Whole Farm Grocery Cashew (200 g)']/ancestor::div[@class = 'tw-flex tw-w-full tw-flex-col']/descendant::div[text()='ADD']"));
		driver.close();
	}
}
