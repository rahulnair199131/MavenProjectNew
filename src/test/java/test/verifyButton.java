package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyButton {
	
	
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\DriverLatest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		if(driver.findElement(By.name("btnK")).isDisplayed()) {
			
			System.out.println(true);
		}
	}

}
