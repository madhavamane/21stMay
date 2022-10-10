package Keyword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnableKey {

	@BeforeClass
	public void LaunchBrs() {
		System.out.println("Browser is Launch");
	}
	@AfterClass
	public void CloseBrs() {
		System.out.println("Browser is closed");
	}
	@BeforeMethod()
	public void Login() {
		System.out.println("Login in to application");
	}
	@AfterMethod	
	public void Logout() {
		System.out.println("Logout to application");
	}
	@Test(priority=1)
	public void Homepagetest() {
		System.out.println("Check homepage into application");
	}
	@Test(priority = 2,invocationCount = 5,enabled = false)
	public void NotificatonPageTest() {
		System.out.println("Check Notification Page into application");
	}
	@Test
	public void SettingpageTest() {
		System.out.println("Check setting page into application");
	}
	
}
