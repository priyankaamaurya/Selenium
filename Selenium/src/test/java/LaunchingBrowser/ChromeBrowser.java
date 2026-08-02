package LaunchingBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
//		## Launching of browser 
//		ChromeDriver ref = new ChromeDriver();
//		FirefoxDriver ref = new FirefoxDriver();
//		RemoteWebDriver ref = new ChromeDriver();
//		WebDriver ref = new ChromeDriver();

//		## Navigate to url
//		ref.get("https://www.google.com");
//		ref.get("https://www.amazon.com");

		
		
		
		// Setup ChromeDriver
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Open FaceBook
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		// Find login elements using XPath
		// Email/Phone field
		WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println("Email field found: " + emailField.isDisplayed());
		
		// Password field
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='pass']"));
		System.out.println("Password field found: " + passwordField.isDisplayed());
		
		// Login button
        WebElement loginButton = driver.findElement(By.xpath("//div[@role='button']"));
        System.out.println("Login button found: " + loginButton.isDisplayed());
		
        
        // Navigate to Amazon
     	driver.get("https://www.amazon.com");
     	
     	// search mobiles
     	WebElement searchBox = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']"))
            );
            searchBox.sendKeys("mobiles");

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchButton.click();
        Thread.sleep(2000);
     	
     	System.out.println("Search Done. Current URL: " + driver.getCurrentUrl());
     	
     	// Write XPath for add to cart
     	WebElement addToCartBtn = driver.findElement(By.xpath(
     		    "(//div[@data-component-type='s-search-result'])[1]//button[contains(@aria-label,'Add to cart')]"
     	));
     	addToCartBtn.click();
     	
     	Thread.sleep(2000);
     	
     	
     	// Navigate to Zepto website
     	driver.get("https://www.zepto.com");
     	
        // Find all "Add" buttons on the page
        List<WebElement> addButtons = driver.findElements(By.xpath("//button[contains(text(),'ADD')]"));
        System.out.println("Total Add buttons found: " + addButtons.size());

        int addedCount = 0;
        int i = 0;

        // Keep trying buttons one by one until 3 products are successfully added
        while (i < addButtons.size() && addedCount < 3) {
            try {
                addButtons.get(i).click();
                addedCount++;
                System.out.println("Product " + addedCount + " added to cart");
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Button at index " + i + " could not be clicked, trying next one");
            }
            i++;
        }

        System.out.println("Total products added to cart: " + addedCount);
     	
        
        // Navigate to DemoWebShop
        driver.get("https://demowebshop.tricentis.com/");

        // Click on the Register link (top right of header)
        WebElement registerLink = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registerLink.click();

        // Wait for Register page to load
        wait.until(ExpectedConditions.urlContains("register"));

        // Select Gender
        WebElement genderMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
        genderMale.click();

        // Enter First Name
        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Raman");

        // Enter Last Name
        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Yadav");

        // Enter Email (unique email each run using timestamp)
        String uniqueEmail = "raman" + System.currentTimeMillis() + "@testmail.com";
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys(uniqueEmail);

        // Enter Password
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Test@1234");

        // Enter Confirm Password
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("Test@1234");

        // Click Register button
        WebElement registerButton = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerButton.click();

        // Validate registration was successful
        wait.until(ExpectedConditions.urlContains("registerresult"));
        WebElement resultMessage = driver.findElement(By.xpath("//div[@class='result']"));
        String resultText = resultMessage.getText();

        System.out.println("Registration result message: " + resultText);

        if (resultText.contains("Your registration completed")) {
            System.out.println("TEST PASSED: Registration was successful");
        } else {
            System.out.println("TEST FAILED: Registration did not complete as expected");
        }

        Thread.sleep(2000);
        
        driver.quit();
	} 
		
}
 