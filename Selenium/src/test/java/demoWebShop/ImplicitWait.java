package demoWebShop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop"); 
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
		
	}

}
