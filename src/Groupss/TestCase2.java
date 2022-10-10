package Groupss;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {

	@BeforeClass(alwaysRun=true)
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	@AfterClass(alwaysRun=true)
	public void closeBlowser() {
		System.out.println("Browser is close");
	}
	@Test(groups="Smoke")
	public void Test4() {
		System.out.println("Executing Test 4");
	}
	@Test(groups="functional")
	public void Test5() {
		System.out.println("Executing Test 5");
	}
	@Test(groups={"functional","Regression"})
	public void Test6() {
		System.out.println("Executing Test 6");
	}
}
