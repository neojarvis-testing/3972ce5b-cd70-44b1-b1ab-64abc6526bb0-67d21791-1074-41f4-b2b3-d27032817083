package stepdefinition;

import Pages.NykaaHomeSearch;
import Pages.NykaaKurtaLogin;
import Pages.NykaaKurtaProduct;
import Pages.NykaaKurtaSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KurtaLogin {
    

    @Given("The user inputs kurtas {string}")
public void the_user_inputs_kurtas(String string) {
        NykaaHomeSearch action1 = new NykaaHomeSearch();
    

        action1.homeSearchKurta(string);
}
@When("The user views products of Kurta")
public void the_user_views_products_of_kurta() {
        NykaaKurtaSearch action2 = new NykaaKurtaSearch();



    
        action2.kurtasearch(Hooks.test);
}
@Then("The user chooses and Logs In")
public void the_user_chooses_and_logs_in() {
        NykaaKurtaProduct action3 = new NykaaKurtaProduct();
        NykaaKurtaLogin action4 = new NykaaKurtaLogin();
        action3.kurtaProduct();
        action4.kurtaLogin();
}


}
