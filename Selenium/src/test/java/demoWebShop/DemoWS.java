package demoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWS {
	
//	public static void main(String[] args) throws InterruptedException{
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.amazon.in/");
//		
//		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
//		
//		Thread.sleep(3000);
//		
//		element.sendKeys("Apple Mobile");
//		
//		Thread.sleep(2000);
//
//		element.sendKeys(Keys.CONTROL, "a");
//		
//		Thread.sleep(2000);
//		
//		element.sendKeys(Keys.CONTROL, "x");
//		
//		Thread.sleep(2000);
//		
//		element.sendKeys("Iphone");
//		
//		Thread.sleep(2000);
//		
//		element.sendKeys(Keys.BACK_SPACE);
//		
//		Thread.sleep(2000);
//		
//		element.sendKeys(Keys.CONTROL, "v");
//		
//		Thread.sleep(2000);
//		
//		element.sendKeys(Keys.ENTER);
//
//		Thread.sleep(2000);
//		
//		driver.quit();
//
//
//		
//	}
	
public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000); 
        
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

        search.sendKeys("apple Mobile", Keys.SPACE);
        Thread.sleep(1000); 
        search.sendKeys(Keys.chord(Keys.CONTROL, "a")); 
        Thread.sleep(1000);
        search.sendKeys(Keys.chord(Keys.CONTROL, "x")); 
        Thread.sleep(2000);

        search.sendKeys("iphone "); 
        Thread.sleep(2000);
        search.sendKeys(Keys.CONTROL, "v");
//        search.sendKeys(Keys.ENTER);
        
      Thread.sleep(3000); 
      
      search.sendKeys(Keys.ARROW_DOWN);
      search.sendKeys(Keys.ARROW_DOWN);
      search.sendKeys(Keys.ARROW_DOWN);
      search.sendKeys(Keys.ENTER);
      
      driver.findElement(By.xpath("//span[contains(text(), 'iPhone 17 Pro Max 1 TB: ')]")).click();


        //driver.quit();
    }

}
