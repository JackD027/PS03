package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.SharedSteps;

public class LoginPage{
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='Email']")
	public WebElement emailId;
	
	@FindBy(xpath = "//input[@id='Password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@value='Log in']")
	public WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
}

