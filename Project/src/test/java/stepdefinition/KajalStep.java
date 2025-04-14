package stepdefinition;

import Pages.AddToBag;
import Pages.KajalAct;
import Pages.NewLaunches;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KajalStep {
    @Given("The user inputs and lands on kajal page")
public void the_user_inputs_and_lands_on_kajal_page() {
    KajalAct action =new KajalAct(); 
        
        
    action.getKajal();
        
}
@When("The user checks newLaunches")
public void the_user_checks_new_launches() {
    NewLaunches action1=new NewLaunches();
    
    action1.newLaunches();
    
}

@Then("The user adds a product to bag")
public void the_user_adds_a_product_to_bag() {
    // AddToBag action2=new AddToBag();
    // action2.addToBag();
}
}
