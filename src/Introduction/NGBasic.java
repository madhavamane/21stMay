package Introduction;

import org.testng.annotations.Test;

public class NGBasic {

	@Test(priority=1)
	public void openURL() {
		System.out.println("URL is opened");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Login in website");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("Logout from website");
	}
		
}
