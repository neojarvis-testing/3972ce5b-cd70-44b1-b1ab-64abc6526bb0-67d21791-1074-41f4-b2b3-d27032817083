package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToBagAction;
import pages.AddToCartAction;
import pages.HomePageFooterAction;
import pages.NaturalFaceWashAction;
import pages.NewLaunchesAction;

public class NewLaunchesDefinition {

    @Given("the browser is opened")
    public void the_browser_is_opened() {

    }

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {

    }

    @When("user scrolls down to the footer and clicks {string} under {string}")
    public void user_scrolls_down_to_the_footer_and_clicks_under(String string, String string2) {
        HomePageFooterAction.clickNewLaunches(Hooks.test);
    }

    @Then("switch to the new window and verify {string} is displayed")
    public void switch_to_the_new_window_and_verify_is_displayed(String string) {
        NewLaunchesAction.displayNewLaunches(Hooks.test);
    }

    @Then("user hovers over {string} and selects {string} under {string}")
    public void user_hovers_over_and_selects_under(String string, String string2, String string3) {
          NewLaunchesAction.allLaunches(Hooks.test);
          
    }

    @Then("verifies {string} is displayed and applies the third option in the price filter")
    public void verifies_is_displayed_and_applies_the_third_option_in_the_price_filter(String string) {
           NaturalFaceWashAction.allNaturalFace(Hooks.test);
    }

    @Then("clicks the first product link in the search results and switches to the new window")
    public void clicks_the_first_product_link_in_the_search_results_and_switches_to_the_new_window() {
             NaturalFaceWashAction.clickFirstProduct(Hooks.test);
    }

    @Then("inputs {string} in the Delivery Options field and clicks {string}")
    public void inputs_in_the_delivery_options_field_and_clicks(String string, String string2) {
         AddToBagAction.allAddToBag(Hooks.test , string);
    }

    @Then("adds the product to the bag, clicks the {string} icon")
    public void adds_the_product_to_the_bag_clicks_the_icon(String string) {
        AddToCartAction.allCart(Hooks.test);
    }

    @Then("the Face wash products displayed should be available on the result page.")
    public void the_face_wash_products_displayed_should_be_available_on_the_result_page() {
          AddToCartAction.isBagDisplayed(Hooks.test);
    }

}
