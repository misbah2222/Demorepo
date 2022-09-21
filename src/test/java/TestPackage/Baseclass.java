package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestNG1.Homepage;
import TestNG1.LoginPage;

public class Baseclass  {
	@Test
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/misbahriaz/Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://usaconsultingtech.com/");
		driver.manage().window().fullscreen();
		
		
		
		Homepage hp = new Homepage(driver);
		hp.gotosearch();
		
		LoginPage lp = new LoginPage(driver);
		lp.login();
		Thread.sleep(10000);
		driver.quit();
	    
		
		
		
	}
	
	
	

}
