package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AccountCreationTest {
	
	@Test(priority = 2)
	public void createAccount() {
		Reporter.log("Created", true);				
	}
	
	@Test(priority = 1)
	public void deleteAccount() {
		Reporter.log("Deleted", true);				
	}
	
	@Test(priority = 4)
	public void updateAccount() {
		Reporter.log("Updated", true);				
	}

}

