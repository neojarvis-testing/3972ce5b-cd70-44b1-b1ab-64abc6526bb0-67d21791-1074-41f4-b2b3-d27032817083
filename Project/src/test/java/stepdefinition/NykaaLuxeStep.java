package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NykaaHomePage;
import pages.NykaaLuxe;
import pages.NykaaLuxeProduct;
import pages.NykaaMan;

public class NykaaLuxeStep {

    @Given("The user navigates to footer and click Nykaa")
    public void the_user_navigates_to_footer_and_click_nykaa() {
        NykaaHomePage action = new NykaaHomePage();
        action.footerLuxeClick();
    }

    @Given("The user sees Luxe displayed")
    public void the_user_sees_luxe_displayed() {
        NykaaLuxe action = new NykaaLuxe();
        action.luxeVerify();
    }

    @When("The user sorts and filters Products")
    public void the_user_sorts_and_filters_products() {
        NykaaLuxe action = new NykaaLuxe();
        action.luxeSortAndFilter();
    }

    @When("The user clicks on first product")
    public void the_user_clicks_on_first_product() {
        NykaaLuxe action = new NykaaLuxe();
        action.firstProductClick();
    }

    @When("The user navigates to footer and click Nykaa Man")
    public void the_user_navigates_to_footer_and_click_nykaa_man() {
        NykaaLuxeProduct action = new NykaaLuxeProduct();
        action.footerNykaaManClick();
    }

    @Then("The user clicks grooming advice and sees the Shaving And Beard Care section")
    public void the_user_clicks_grooming_advice_and_sees_the_shaving_and_beard_care_section() {
        NykaaMan action = new NykaaMan();
        action.nykaaMan();
    }
}