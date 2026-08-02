package demoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://demowebshop.tricentis.com/");
	        
	        driver.findElement(By.linkText("Register")).click();
	        
	        // validate the navigation
	        String currentUrl = driver.getCurrentUrl();
	        
	        // validate
	        if(currentUrl.contains("register")) {
	        	System.out.println("Register page was loaded");
	        }
	        
	        else {
	        	  System.out.println("invalid web page");
	        	  System.out.println(driver.getTitle());
	        }
	        
	        driver.findElement(By.id("gender-female")).click();
	        
	        driver.findElement(By.id("FirstName")).sendKeys("Priyanka");
	        
	        driver.findElement(By.id("LastName")).sendKeys("Maurya");
	        
	        driver.findElement(By.id("Email")).sendKeys("abcfeg15176@gmail.com");

	        driver.findElement(By.xpath("//input[@name ='Password']")).sendKeys("abc567");

	        driver.findElement(By.xpath("//input[@id ='ConfirmPassword']")).sendKeys("abc567");

	        driver.findElement(By.xpath("//div//input[@id='register-button']")).click();

	        // Validate Registration Success
	  
	         String actualMessage = driver.findElement(By.className("result")).getText();
		              
	         String  expectedMessage = "Your registration completed";
	 
	         if (actualMessage.equals(expectedMessage)) 
	         {
	        	 System.out.println("Registration Successful");
	         }
	        else {
	        	    System.out.println("Registration Fail");
	        	}
	         
	       // Validate Email 
	        WebElement userEmail = driver.findElement(By.xpath("//a[text()='abcfeg15176@gmail.com']"));
//
	        String actualEmail = userEmail.getText();
//
	        if(actualEmail.contains("@gmail.com")) {
	            System.out.println("User is logged in: " + userEmail.getText());
	        } else {
	            System.out.println("User is NOT logged in");
	        }
	         
	       }
	 }