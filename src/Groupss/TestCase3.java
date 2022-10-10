package Groupss;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {

	@BeforeClass(alwaysRun=true)
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	@AfterClass(alwaysRun=true)
	public void closeBlowser() {
		System.out.println("Browser is close");
	}
	@Test(groups="Smoke")
	public void Test7() {
		System.out.println("Executing Test 7");
	}
	@Test(groups="functional")
	public void Test8() {
		System.out.println("Executing Test 8");
	}
	@Test(groups={"functional","Regression"})
	public void Test9() {
		System.out.println("Executing Test 9");
	}	
}
