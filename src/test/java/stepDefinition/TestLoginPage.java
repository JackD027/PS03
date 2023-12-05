package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginPage;

public class TestLoginPage {
	public static WebDriver driver ;
	SharedSteps sharedSteps = new SharedSteps(driver);
	LoginPage loginPage;
	HomePage homePage;

	@Given("I am on Login Page")
	public void i_am_on_login_page() {
		sharedSteps .openBrowser();
		driver = sharedSteps.getDriver();
		homePage = new HomePage(driver);
		homePage.clickonLogin();
		loginPage = new LoginPage(driver);
	}

	@Given("I give the email and password")
	public void i_give_the_email_and_password(){
		loginPage.emailId.sendKeys("admin123@google.com");
		loginPage.password.sendKeys("admin123");
		
	}

	@When("I click submit")
	public void i_click_submit() {
	    loginPage.loginButton.click();
	}

	@When("I am logged in as admin")
	public void i_am_logged_in_as_admin() {
		String actualEmail= driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText();
		Assert.assertEquals(actualEmail, "admin123@google.com");		sharedSteps = new SharedSteps(driver);
		sharedSteps.closebrowser();
	}
}
