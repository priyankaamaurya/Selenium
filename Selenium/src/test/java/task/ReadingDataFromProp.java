package task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadingDataFromProp {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException{
		
		FileInputStream file = new FileInputStream("src/test/resources/Facebook.properties");
		
		Properties prop = new Properties();
		
		prop.load(file);
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		
		System.out.println(browser);
		
		switch (browser) {
		
		case "Chrome" :
			driver = new ChromeDriver();
			break;
		
		case "Edge" : 
			driver = new EdgeDriver();
			break;
			
		case "Firefox" :
			driver = new FirefoxDriver();
			break;
			
		default : 
			System.out.println("Enter a valid browser name");
			break;
		
		}
		 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Thread.sleep(3000);
		
		driver.get(url);
		
		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys(email);
		
		driver.findElement(By.id("_R_1hmkqsqppb6amH1_")).sendKeys(password);
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		String errorMsg = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(
			        By.xpath("//div[@role='alert']")
			    )
		).getText();
						
		FileOutputStream fileOutput = new FileOutputStream("src/test/resources/Facebook.properties");
		
		prop.setProperty("errorMsg", errorMsg);
		
		prop.store(fileOutput, "Facebook Login");
		
		fileOutput.close();
	}

}
