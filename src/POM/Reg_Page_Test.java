package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Reg_Page_Test {

	// Browser setup ==> validations apply ==> browser close.
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
	 public void fbRegPage_Postive() {
		 RegPage p=new RegPage(driver);
		 p.ClickFbSignUpLink();
		 p.VerifyRegPagefblogo();
		 p.VerifyRegAlreadyAccount();
		 p.SetfbRegPagefirstName();
		 p.SetfbRegPageSurName();
		 p.SetfbRegPageMobileEmail();
		 p.SetfbRegPageReEmail();
		 p.SetfbRegPagePassword();
		 p.SetfbRegPageBirthday();
		 p.SetfbRegPageBirthMonth();
		 p.SetfbRegPageBirthYear();
		 p.SetfbRegPageGender("male");
		 p.ClickfbRegPageSubmitBtn();
	 }	
}
