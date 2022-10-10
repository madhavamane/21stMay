package Introduction;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {
    
	@BeforeClass
    public void login() {
		System.out.println("Login app");
		Reporter.log("Login app");
	}
	@AfterClass
	public void logout() {
		System.out.println("Logout app");
		Reporter.log("Logout app");
	}
	@Test(priority=3)
	public void profilepage() {
		System.out.println("profile page");
		Reporter.log("profile page");
	}
	@Test(priority=2)
	public void Homepage() {
		System.out.println("Home page");
		Reporter.log("Home page");
	}
	@Test(priority=1)
	public void notification() {
		System.out.println("notification");
		Reporter.log("notification");
	}	
}
