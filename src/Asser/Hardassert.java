package Asser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {

	//1. assertEquals()
	String str1 ="Hi";
	String str2 ="Hi";
	@Test
	public void Test1() {
	Assert.assertEquals(str1, str2);
	}
	//2. assertNotEquals()	
	@Test
	public void Test2() {
		String str1 ="Hello";
		String str2 ="Hi";
	Assert.assertNotEquals(str1, str2);  // Pass
	}	
	//3. assertTrue()
	@Test
	public void Test3() {
		Assert.assertTrue(true);
	}
	//4. assertFalse()
	@Test
	public void Test4() {
		Assert.assertFalse(false);
	}
	//5. assertNull()
	@Test
	public void Test5() {
    String str1 =null;
	Assert.assertNull(str1);
	}
	//6. assertNotNull()
	@Test
	public void Test6() {
	String str="ff";
	Assert.assertNotNull(str);
	}
	//7. fail()
	@Test
	public void Test7() {
	Assert.fail();
	}	
}
