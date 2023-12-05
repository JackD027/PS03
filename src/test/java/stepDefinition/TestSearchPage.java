package stepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import pageFactory.SearchPage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TestSearchPage {

	public static WebDriver driver ;
	SharedSteps sharedSteps = new SharedSteps(driver);
	SearchPage searchPage;
	HomePage homePage;
    
    @Given("I am on Search Page")
    public void i_am_on_search_page() {
    	sharedSteps .openBrowser();
		driver = sharedSteps.getDriver();
		searchPage = new SearchPage(driver);
    }

    @Given("I enter the search text")
    public void i_enter_the_search_text() {
    	searchPage.searchArea.sendKeys("Fiction");
    }

    @Then("I click on submit")
    public void i_click_on_submit() {
    	searchPage.searchBtn.click();
    }

    @SuppressWarnings("deprecation")
	@Then("I verify the search results")
    public void i_verify_the_search_results() {
       String productGot = searchPage.product.getText();
       Assert.assertEquals(productGot,"Fiction");
       sharedSteps = new SharedSteps(driver);
	   sharedSteps.closebrowser();
    }

}
