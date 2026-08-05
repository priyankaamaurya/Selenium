package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQa {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement c = driver.findElement(By.tagName("div"));

		Select sel = new Select(c);
		sel.selectByVisibleText("Red");

		Thread.sleep(3000);
		
		c = driver.findElement(By.tagName("div"));
		sel = new Select(c);
		sel.selectByVisibleText("Voilet");
		
		Thread.sleep(3000);

		c = driver.findElement(By.tagName("div"));
		sel = new Select(c);
		sel.selectByVisibleText("Purple");
		
		sel.deselectByVisibleText("Purple");


		WebElement selected2 = sel.getFirstSelectedOption();
		System.out.println("Selected Option 2: " + selected2.getText());

		
		
		
	}

	
}
