package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AccountCreationTest {
	
	@Test(priority = 1)
	public void crtAcc() {
		Reporter.log("Account Created", true);				
	}
	
	@Test(priority = 3)
	public void dltAcc() {
		Reporter.log("Account Deleted", true);				
	}
	
	@Test(priority = 2)
	public void updtAcc() {
		Reporter.log("Account Updated", true);				
	}

}

