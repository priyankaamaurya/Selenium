package demoWebShop;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWS {
	
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
      
      String id = driver.getWindowHandle();
      System.out.println(id);
      
      driver.findElement(By.xpath("//span[contains(text(), 'iPhone 17 Pro Max 1 TB: ')]")).click();
      
      Set<String> ids = driver.getWindowHandles();
      
      for(String str:ids) {
    	  if(!str.equals(id)) {
    		  driver.switchTo().window(str);
    		  System.out.println(str);
    	  }
      }
      
      Thread.sleep(5000);
      System.out.println(driver.getCurrentUrl());
      driver.findElement(By.xpath("//div[@id='a-accordion-auto-6']//input[@id='add-to-cart-button']")).click();

      
        //driver.quit();
    }

}
