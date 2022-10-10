package PackageSuitAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeSuite
	public void emailConfiguration() {
		System.out.println("Email is Configure");
	}
	@AfterSuite
	public void emailSent() {
	     System.out.println("email sent");	
	}
	@BeforeTest
	public void openDB() {
		System.out.println("Database is open");
	}
	@AfterTest
	public void closeDB() {
		System.out.println("Database is close");
	}
	@BeforeClass
	public void openBrs() {
		System.out.println("Browser is open");
	}
	@AfterClass
	public void closeBrs() {
		System.out.println("Browser is close");
	}
	@Test
	public void m1() {
		System.out.println("Method m1");
	}
	
	@Test
	public void m2() {
		System.out.println("Method m2");
	}
	
	@Test
	public void m3() {
		System.out.println("Method m3");
	}	
}
