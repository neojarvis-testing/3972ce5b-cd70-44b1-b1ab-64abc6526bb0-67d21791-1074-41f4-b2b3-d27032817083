package stepdefinition;

import Pages.TestCase5Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancellationPolicyStep {
    
    TestCase5Actions action1=new TestCase5Actions(); 
    @Given("the user clicks on the homepage help")
public void the_user_clicks_on_the_homepage_help() {
     
    action1.clickOnHelp_ClickOnOrderRelated(Hooks.test);

}
@When("the user clicks and views refunds")
public void the_user_clicks_and_views_refunds() {
    
    action1.NavigateAnd_ClickOnCancelletionsAndRefund(Hooks.test);
}
@When("the user navigates to cancellation page")
public void the_user_navigates_to_cancellation_page() {
   
    action1.clickOnCancellationPolicy_ClickOnLinkSwitchWindow(Hooks.test);
}
@Then("the user lands on the Cancellation result page")
public void the_user_lands_on_the_cancellation_result_page() {
    
    action1.userOnCancellation(Hooks.test);
}
}
