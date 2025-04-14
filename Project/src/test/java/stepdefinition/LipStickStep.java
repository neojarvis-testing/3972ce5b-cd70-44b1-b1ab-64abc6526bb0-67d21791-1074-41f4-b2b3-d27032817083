package stepdefinition;

import Pages.TestCase6Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LipStickStep {
    TestCase6Actions action=new TestCase6Actions(); 
    @Given("the user searches for lipstick {string}")
public void the_user_searches_for_lipstick(String string) {
    
    action.searchForLipstick_And_NavigateToLiquidLipsticks(Hooks.test,string);
        
}
@When("the user clicks a product and chooses shade")
public void the_user_clicks_a_product_and_chooses_shade() {
    action.HoverOnFirstProduct_AndClickOnPreviewShades(Hooks.test);
        
}
@And("the user wants to Contact")
public void the_user_wants_to_contact() {
    action.clickViewDetails_ClickOnDownArrow_SelectThirdOption(Hooks.test);
        
}
@And("the user adds the product to wishlist")
public void the_user_adds_the_product_to_wishlist() {
    action.scrollDownToFooter_ClickOnContactUs(Hooks.test);
        
}
@Then("the user checks how to add items")
public void the_user_checks_how_to_add_items() {
    action.clickOnNykaaAccount_ClickOnMyWhishlist(Hooks.test);
    action.clickOnHowDoIAddItems_CaptureTheScreenshot(Hooks.test);
}
}
