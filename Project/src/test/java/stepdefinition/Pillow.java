package stepdefinition;

import Pages.NykaaHomeSearch;
import Pages.NykaaPillowProduct;
import Pages.NykaaPillowSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Pillow {

    @Given("The user searches for pillow {string}")
public void the_user_searches_for_pillow(String string) {
        NykaaHomeSearch action1 = new NykaaHomeSearch();
        action1.homeSearchPillow(string);
}
@Given("the user clicks on first product")
public void the_user_clicks_on_first_product() {
        NykaaPillowSearch action2 = new NykaaPillowSearch();
        action2.pillowSearch();
}
@Then("the user adds the product to bag")
public void the_user_adds_the_product_to_bag() {
    NykaaPillowProduct action3 = new NykaaPillowProduct();
    action3.pillowProduct();
}

}
