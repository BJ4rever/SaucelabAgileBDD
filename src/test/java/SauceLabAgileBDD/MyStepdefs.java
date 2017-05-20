package SauceLabAgileBDD;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;



/**
 * Created by Gamita on 19/05/2017.
 */
public class MyStepdefs extends BasePage {

    HomePage homePage = new HomePage();

    @Given("^User is on Tesco home page$")
    public void userIsOnTescoHomePage() {
        homePage.userIsOnHomePage();
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"),"User is not on HomePage");

    }

    @When("^User search for any \"([^\"]*)\"on search menu$")
    public void user_search_for_any_on_search_menu(String product) {
        homePage.userShouldAbleToSearchAnyProduct(product);
    }

    @Then("^User should able to view all related \"([^\"]*)\" as a search result$")
    public void user_should_able_to_view_all_related_as_a_search_result(String product) {
        homePage.verifySearchResult(product);
    }
}