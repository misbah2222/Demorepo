package TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void login() {
		
	driver.findElement(By.xpath("//header/div[3]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li[4]/a[1]")).click();	
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]")).click();	
		
	
	}

}
