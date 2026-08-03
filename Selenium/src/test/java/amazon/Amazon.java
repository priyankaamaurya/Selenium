package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        
		Thread.sleep(2000);


//        element.sendKeys("Mobiles",Keys.SPACE, Keys.SHIFT, "REALME", Keys.BACK_SPACE);
        
        element.sendKeys("Apple", Keys.ARROW_DOWN);
        
		Thread.sleep(2000);
        
        element.sendKeys(Keys.ARROW_DOWN);
        
		Thread.sleep(2000);

        element.sendKeys(Keys.ARROW_DOWN);
        
		Thread.sleep(2000);
        
        element.sendKeys(Keys.ENTER);


		
	}

	
}
