package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AccountCreationTest {
	
	@Test(priority = 2)
	public void create() {
		Reporter.log("Account Created", true);				
	}
	
	@Test(priority = 1)
	public void delete() {
		Reporter.log("Account Deleted", true);				
	}
	
	@Test(priority = 3)
	public void updateAcc() {
		Reporter.log("Account Updated", true);				
	}

}

