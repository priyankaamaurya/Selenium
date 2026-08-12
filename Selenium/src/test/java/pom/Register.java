package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	public Register(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='Female']")
	private WebElement gender;
	 
	public WebElement getGender() {
		return gender;
	}
	
	@FindBy(id="FirstName")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}

	@FindBy(id="LastName")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(id="Email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}

	@FindBy(id="Password")
	private WebElement pswd;
	
	public WebElement getPswd() {
		return pswd;
	}
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPswd;
	
	public WebElement getConfirmPswd() {
		return confirmPswd;
	}
	
	@FindBy(id = "register-button")
	private WebElement register;

	public WebElement getRegister() {
		return register;
	}


	

	

	

	
	
	



}
