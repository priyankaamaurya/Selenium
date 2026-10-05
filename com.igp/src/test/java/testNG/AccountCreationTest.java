package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AccountCreationTest {
	
	@Test(priority = 1)
	public void createAccount() {
		Reporter.log("Account Created", true);				
	}
	
	@Test(priority = 3)
	public void deleteAccount() {
		Reporter.log("Account Deleted", true);				
	}
	
	@Test(priority = 2)
	public void updateAccount() {
		Reporter.log("Account Updated", true);				
	}

}

