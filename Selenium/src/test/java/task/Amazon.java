package task;

//import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/ref=nav logo");
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
        
        driver.findElement(By.xpath("//input[@value='Go']")).click();
        
        Thread.sleep(3000);
        
        List<WebElement> allProducts = driver
        		.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2//span"));
        
        List<WebElement> allAddToCartButton = driver
        		.findElements(By.xpath("//input[@aria-label='Add to cart']"));
        
        Iterator<WebElement> itr = allProducts.iterator();
        
        int pointer = 0;
        
        while(itr.hasNext()) {
        	
        	String name = itr.next().getDomProperty("innerText");
        	
        	if(name.contains("realme ")) {
        		
        		System.out.println(name);
        		
        		try {
        			allAddToCartButton.get(pointer).click();
        		} catch (Exception e) {
        			driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();
        		}
        		
        	}
        	
        	pointer++;
        }
        
        driver.quit();
        
    }
}