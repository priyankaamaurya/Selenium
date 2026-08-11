package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String name = driver.findElement(By.xpath("(//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'])[1]")).getText();
		
		System.out.println(name);
		
		driver.findElement(By.id("wrong-id"));
		
	}

}
