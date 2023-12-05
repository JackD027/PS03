package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@value='Search store']")
	public WebElement searchArea;

	@FindBy(xpath = "//input[@value='Search']")
	public WebElement searchBtn;
	
	@FindBy(xpath = "(//h2[@class='product-title'])[1]")
	public WebElement product;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
}
