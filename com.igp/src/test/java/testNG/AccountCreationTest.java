package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AccountCreationTest {
	
	@Test(priority = 2)
	public void createAcc() {
		Reporter.log("Account Created", true);				
	}
	
	@Test(priority = 1)
	public void deleteAcc() {
		Reporter.log("Account Deleted", false);				
	}
	
	@Test(priority = 3)
	public void updateAcc() {
		Reporter.log("Account Updated", true);				
	}

}

