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
		
		Thread.sleep(3000);
		
		String errorMsg = driver.findElement(By.xpath("//*[name()='svg' and @class='x1lliihq x2lah0s x1k90msu x2h7rmj x1qfuztq x1a1m0xk xlup9mm x1kky2od']/../..")).getText(); 
		
		FileOutputStream fileOutput = new FileOutputStream("src/test/resources/Facebook.properties");
		
		prop.setProperty("errorMsg", errorMsg);
		
		prop.store(fileOutput, "Facebook Login");
		
		fileOutput.close();
	}

}



//public class Facebook {
//	 static WebDriver driver;
//
//	 	
//    public static void main(String[] args) throws IOException, InterruptedException {
// 
//       
//        FileInputStream file = new FileInputStream(
//        		"src/test/resources/FacebookData.properties");
//       
//        Properties prop = new Properties();
//
//        prop.load(file);
// /Selenium/src/test/resources/FacebookData.properties
//       
//        String browser = prop.getProperty("browser");
//        String url = prop.getProperty("url");
//        String userName = prop.getProperty("username");
//        String password = prop.getProperty("password");
//       
//        switch (browser) {
//
//        case "Chrome":
//            driver = new ChromeDriver();
//            break;
//
//        case "Firefox":
//            driver = new FirefoxDriver();
//            break;
//
//        case "Edge":
//            driver = new EdgeDriver();
//            break;
//
//        default:
//            System.out.println("Enter a valid browser name");
//            break;
//        }
//
//        driver.manage().window().maximize();
//
//        Thread.sleep(3000);
//        driver.get(url);
//
//       
//        driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys(userName);
//
//       
//        driver.findElement(By.id("_R_1hmkqsqppb6amH1_")).sendKeys(password);
//
//        
//        driver.findElement(By.xpath("//span[text()=\"Log in\"]")).click();
//
//        //Thread.sleep(3000);
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        
//        String errorMessage = driver.findElement(
//                By.xpath("//*[name()='svg' and @class='x1lliihq x2lah0s x1k90msu x2h7rmj x1qfuztq x1a1m0xk xlup9mm x1kky2od']/../.."))
//                .getText();
//////a[@href=\"https://facebook.com/login/identify/\"]"
//        
//                FileOutputStream fileOutput = new FileOutputStream(
//                "src/test/resources/FacebookData.properties");
//
//               prop.setProperty("errorMessage", errorMessage);
//
//              prop.store(fileOutput, "Facebook login");
//
//        fileOutput.close();
//       
//
//        
//    }
//}
