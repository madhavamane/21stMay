package Keyword;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethod {

	@Test(priority=1)
	public void OpenUrl() {
		System.out.println("URL is open");
		Assert.fail();
	}
	@Test(priority=2,dependsOnMethods="OpenUrl")
	public void Login() {
		System.out.println("Login in to application");
	}
	@Test(priority=3,dependsOnMethods={"OpenUrl","Login"})
	public void Logout() {
		System.out.println("logout to application");	
}
}







