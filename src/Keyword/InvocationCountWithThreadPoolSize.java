package Keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountWithThreadPoolSize {

	@Test(invocationCount=5,threadPoolSize=5)
	public void OpenBrs() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\madha\\Desktop\\selenium jar files\\chromedriver.exe\\");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();
	}
}
