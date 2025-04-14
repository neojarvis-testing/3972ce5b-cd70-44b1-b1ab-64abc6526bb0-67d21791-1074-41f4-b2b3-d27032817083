package stepdefinition;

import Pages.TestCaseTenModuleOne;
import Pages.TestCaseTenModuleThree;
import Pages.TestCaseTenModuleTwo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NykaaMan {
    @Given("the user clicks on Nykaa Man")
public void the_user_clicks_on_nykaa_man() {
TestCaseTenModuleOne action1 = new TestCaseTenModuleOne();
      

        action1.footerPage();
        
}
@When("the user lands on NykaMan page")
public void the_user_lands_on_nyka_man_page() {

    TestCaseTenModuleTwo action2 = new TestCaseTenModuleTwo();

    action2.nykaaManPage();


}
@Then("user views the first product with pincode {string}")
public void user_views_the_first_product_with_pincode(String string) {
    TestCaseTenModuleThree action3 = new TestCaseTenModuleThree();

    action3.firstProductPage(string);
}

}
