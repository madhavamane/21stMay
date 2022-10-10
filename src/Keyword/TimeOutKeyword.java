package Keyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOutKeyword {

	@BeforeClass
	public void LaunchBrs() {
		System.out.println("Browser is Launch");
	}
	@AfterClass
	public void CloseBrs() {
		System.out.println("Browser is Closed");
	}
	@BeforeMethod
	public void Login() {
		System.out.println("Login in to application");
	}
	@AfterMethod
	public void Logout() {
		System.out.println("Logout in to application");
	}
	@Test(priority=1,timeOut=5000)
	public void HomePage() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("check home page in application");
	}
	@Test(priority=2,invocationCount=5)
	public void Notificationpage() {
		System.out.println("check notification page in application");
	}
	
}
