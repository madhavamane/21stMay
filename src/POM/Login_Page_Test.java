package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Page_Test {

	WebDriver driver;
     @BeforeClass
     public void setup() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\madha\\Desktop\\java\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 }
	 @AfterClass
	 public void teardown() {
		  //driver.close();
	 }
	 @Test
		public void FacebookLoginPageTest() {
		 Login_Page l=new Login_Page(driver);
		 l.VerifyfbLogin_Pagelogo();
		 l.VerifyLogin_PageTagline();
		 l.VerifyLogin_PageForgetPassword();
		 l.VerifyLogin_PageCreateNewAccount();
		 l.VerifyfbLoginPageFooterlinksize();
		 l.SetLogin_PageUsername();
		 l.SetLogin_PagePassword();
		 l.ClickLogin_PageLoginBtn();
		 
	 }	
}
