package Introduction;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethode {

	@BeforeMethod
	public void login() {
		System.out.println("Logged in to application");
		Reporter.log("Logged in to application");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logged out to application");
		Reporter.log("Logged out to application");
	}
	@Test(priority=2)
	public void homepage() {
		System.out.println("check the homepage");
		Reporter.log("check the homepage");
	}
	@Test(priority=1)
	public void profilepage() {
		System.out.println("check the profile");
		Reporter.log("check the profile");
	}
	@Test(priority=3)
	public void notification(){
		System.out.println("check the notification");
		Reporter.log("check the notification");	
	}	
}
