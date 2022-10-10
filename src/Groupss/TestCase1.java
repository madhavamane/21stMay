package Groupss;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeTest(alwaysRun=true)
	public void openDB() {
		System.out.println("Database is open");
	}
	@AfterTest(alwaysRun=true)
	public void closeDB(){
		System.out.println("Database is close");
	}
	@BeforeClass(alwaysRun=true)
	public void openBrs() {
		System.out.println("Browser is open");
	}
	@AfterClass(alwaysRun=true)
	public void closeBrs() {
		System.out.println("Browser is close");
	}
	@Test(groups="Smoke")
	public void Test1() {
		System.out.println("Execute Test 1");
	}
	@Test(groups="functional")
	public void Test2() {
		System.out.println("Execute Test 2");
	}
	@Test(groups={"functional","Regression"})
	public void Test3() {
		System.out.println("Execute Test 3");
	}
}
