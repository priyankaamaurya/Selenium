package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement c = driver.findElement(By.id("small-searchterms"));
		c.sendKeys("Computer");
		c.submit();
		
		WebElement p = driver.findElement(By.id("products-orderby"));
		p.click();
		
		Select sel = new Select(p);
		sel.selectByContainsVisibleText("Name: A to Z");
		
		WebElement d = driver.findElement(By.id("products-pagesize"));
		d.click();
		
		Select sel1 = new Select(d);
		sel.selectByContainsVisibleText("4");
		
		
	}

	
}
