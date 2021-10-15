package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.GooglePage;

public class maven {
	
	WebDriver driver;
	
	
	
	@BeforeTest
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\DriverLatest\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Test
	@Parameters({"data"})
	public void testngTest(String data) {
		
		
		
		//driver.navigate().to("https://www.google.com");
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		
		System.out.println("The data value is ++++++"+data);
		
		System.out.println("Added line for Git testing - Ramya V");
		
		//System.out.println("Title is "+title);
		
		Assert.assertEquals(driver.getTitle(), data);
		
		
		

	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
	}

}
