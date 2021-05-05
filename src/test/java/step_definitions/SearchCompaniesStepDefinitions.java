package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.QuotePage;
import pages.SecurityDetailsPage;
import utilities.Driver;
import utilities.Environment;

public class SearchCompaniesStepDefinitions {

    HomePage homePage =new HomePage();
    SecurityDetailsPage securityDetailsPage =new SecurityDetailsPage();
    QuotePage quotePage =new QuotePage();

    String quoteOpen, quoteMarketCap;

    @Given("User is on home page")
    public void user_is_on_home_page() {
        String url = Environment.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("User searches {string} in Quote")
    public void user_searches_in_Quote(String string) throws InterruptedException {

        homePage.quoteInput.sendKeys(string);
        Thread.sleep(2000);
        homePage.quoteInputClick.click();
    }
    @When("User navigates to Quote tab")
    public void user_navigates_to_Quote_tab() throws InterruptedException {
        quotePage.quoteTab.click();
        Thread.sleep(2000);
        quoteOpen=quotePage.open.getText();
        quoteMarketCap=quotePage.marketCap.getText();
    }

    @Then("User should verify {string} and {string}")
    public void user_should_verify_and(String string, String string2) {
        String companyName=homePage.companyName.getText();
        String companySymbol=homePage.companySymbol.getText();
        Assert.assertEquals(companyName,string);
        Assert.assertEquals(companySymbol,string2);
    }
    @When("User navigates to Security Details tab")
    public void user_navigates_to_Security_Details_tab() throws InterruptedException {
        securityDetailsPage.securityDetailsTab.click();

    }
    @Then("User should verify that market cap on quote page matches with Security Details page")
    public void user_should_verify_that_market_cap_on_quote_page_matches_with_Security_Details_page() throws InterruptedException {
        Thread.sleep(2000);
        String securityMarketCap=securityDetailsPage.securityMarketCap.getText();
        Assert.assertEquals(quoteMarketCap,securityMarketCap);
    }
    @Then("Print Market Cap amount and date")
    public void print_Market_Cap_amount_and_date() {
        System.out.println("Market Cap $"+securityDetailsPage.securityMarketCap.getText() +" on "+securityDetailsPage.date.getText());
    }

}
