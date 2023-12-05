package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver ;
	
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement loginText;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gettitle(){
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	public void clickonLogin(){
		loginText.click();
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	

}
