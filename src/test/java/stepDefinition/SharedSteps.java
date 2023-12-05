package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class SharedSteps {

	public static WebDriver driver;

	public SharedSteps(WebDriver driver) {
		this.driver=driver;
	}

	@BeforeMethod
	public void openBrowser() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}
}
