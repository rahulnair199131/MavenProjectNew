package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.maven;

public class GooglePage extends maven{
	
	
	WebDriver driver;
	public GooglePage() {
        
        PageFactory.initElements(driver, this);
        
        
	}
	
	
	@FindBy (name ="q")
	public WebElement searchTextBox;
	
	@FindBy (xpath ="//input[@value='Google Search']")
	public WebElement searchButton;
	
	public void enterText() {
		
		
		driver.get("https://www.google.com");
		searchTextBox.sendKeys("testing");
		searchTextBox.sendKeys(Keys.ENTER);
	}
	
	public void clickSearchButton() {
		
		searchButton.click();
	}
	
	
	

}
