package Asser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserWithSoftasser {

	WebDriver driver;
	@Parameters("browser")
	@Test(priority=1)
	public void CrossBrstesting(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\madha\\Desktop\\java\\chromedriver.exe");
	    driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")){
			 System.setProperty("webdriver.edge.driver", "C:\\Users\\madha\\Desktop\\java\\edgedriver_win64\\msedgedriver.exe");
			 driver = new EdgeDriver();	
		}else {
			System.out.println("Wrong browser is selected");
		}
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	   
	}
    @Test(priority=2)
	public void VerifycurrentURL() {
    	Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
    }
	@Test(priority=3)
	public void VerifypageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	@Test(priority=4)
	public void VerifyUsername() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("M123");
	}
	@Test(priority=5)
	public void VerifyPassword() {
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("M@123");
	}
	@Test(priority=6)
	public void ClickBtn() {
		WebElement LBTN = driver.findElement(By.xpath("//button[@type='submit']"));
		Assert.assertTrue(LBTN.isEnabled());
		LBTN.click();
	}	
}
