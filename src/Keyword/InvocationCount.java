package Keyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {

	@BeforeClass
	public void LaunchBrs() {
		System.out.println("Browser is Launched");
	}
	@AfterClass
	public void CloseBrs() {
		System.out.println("Browser is Closed");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login in application");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout to application");
	}
	@Test(priority = 1)
	public void Homepage() {
		System.out.println("checking Homepage in application");
	}
	@Test(priority=2,invocationCount=5)
	public void Notificationpage() {
		System.out.println("checking Notification in application");
	}	
}
