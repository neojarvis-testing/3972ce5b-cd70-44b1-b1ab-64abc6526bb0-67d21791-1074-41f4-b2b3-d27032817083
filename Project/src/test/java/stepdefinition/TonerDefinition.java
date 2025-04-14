package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToBagAction;
import pages.HomePageNavbarAction;
import pages.TonerAction;

public class TonerDefinition {


    @When("user clicks on searchBar and searches for {string} presses {string}")
    public void user_clicks_on_search_bar_and_searches_for_presses(String string, String string2) {
          HomePageNavbarAction.navbarAll(Hooks.test , string);
    }

    @Then("verifies {string} is displayed, applies the {string} sort, and selects {string} filter")
    public void verifies_is_displayed_applies_the_sort_and_selects_filter(String string, String string2,
            String string3) {
          TonerAction.allToner(Hooks.test);
    }

    @When("user clicks on the first product, switches to a new tab, and verifies {string} under MRP")
    public void user_clicks_on_the_first_product_switches_to_a_new_tab_and_verifies_under_mrp(String string) {
        TonerAction.clikcFirstProductAndInclusive(Hooks.test);
    }

    @When("adds the product to the bag, scrolls to Product Description and click {string}")
    public void adds_the_product_to_the_bag_scrolls_to_product_description_and_click(String string) {
           AddToBagAction.allAddToBag1(Hooks.test);
    }

    @Then("clicks on {string} and product should be displayed")
    public void clicks_on_and_product_should_be_displayed(String string) {
           AddToBagAction.clickReadMore(Hooks.test);
    }
}
