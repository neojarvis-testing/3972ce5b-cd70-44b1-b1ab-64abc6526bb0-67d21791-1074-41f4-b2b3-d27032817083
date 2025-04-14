package stepdefinition;

import Pages.BeautyToGoAct;
import Pages.HomePageAct;
import Pages.OfferZone;
import Pages.TermsConditions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BeautyToGo {
    
    @Given("The user lands on {string} page")
public void the_user_lands_on_page(String string) {
        HomePageAct action =new HomePageAct();
        
        
        action.getApp();
}
@When("The user lands on {string}")
public void the_user_lands_on(String string) {
        BeautyToGoAct action1=new BeautyToGoAct(); 
        
        action1.beautyToGo();
}
@When("The user checks {string} policy")
public void the_user_checks_policy(String string) {
        TermsConditions action2=new TermsConditions();
    
        action2.termsAndCondition(); 
}
@Then("The user views the {string}")
public void the_user_views_the(String string) {
        OfferZone action3=new OfferZone();
        action3.offerZone(); 
}

}
