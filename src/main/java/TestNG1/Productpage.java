package TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Productpage {
	
	WebDriver driver;
	
	@Test
	public void verifyaddtocartbtn() {
		
		System.setProperty("webdriver.chrome.driver","/Users/misbahriaz/Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/flower-girl-bracelet");
		driver.manage().window().fullscreen();
		

		
		driver.findElement(By.xpath("//input[@id='product_enteredQuantity_41']")).clear();
		driver.findElement(By.xpath("//input[@id='product_enteredQuantity_41']")).sendKeys("2");
		driver.findElement(By.xpath("//button[@id='add-to-cart-button-41']")).click();
		driver.findElement(By.xpath("//body/div[@id='bar-notification']/div[1]"));
		
		
		
		
		
		
		
	}
	
	
	
	

}
