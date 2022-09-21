package TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	
	WebDriver driver;
	public Homepage (WebDriver driver){
		this.driver = driver;
	}
	
	public void gotosearch() {
		
		
	driver.findElement(By.xpath("//header/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]")).click();	
	 driver.findElement(By.xpath("//body/div[1]/div[4]/form[1]/div[1]/input[1]")).sendKeys("programming");
	
	 driver.findElement(By.xpath("//body/div[1]/div[4]/form[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);	
		
		
	}
	
	
	
	
	

}
