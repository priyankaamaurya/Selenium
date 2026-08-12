package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Home home = new Home(driver);
		
		home.getRegisterEle().isDisplayed();
		driver.navigate().refresh();
		home.getRegisterEle().click();
		
		Register reg = new Register(driver);
		
		reg.getGender().click();
		
		reg.getFirstName().sendKeys("Priyanka");
		
		reg.getLastName().sendKeys("Maurya");
		
		reg.getEmail().sendKeys("pmmm@gmail.com");
		
		reg.getPswd().sendKeys("pmpmpm");
		
		reg.getConfirmPswd().sendKeys("pmpmpm");
		
		reg.getRegister().click();
		
		
		
		
	}

}
