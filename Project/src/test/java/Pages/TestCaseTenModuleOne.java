package Pages;


import stepdefinition.Hooks;
import uistore.LocFooter;
import utils.Base;
import utils.WebDriverHelper;



public class TestCaseTenModuleOne {

    WebDriverHelper wb = new WebDriverHelper(Base.driver);


    public void footerPage() {
      
            wb.scrollByToFooter(Hooks.test);
            wb.waitForElementToBeVisible(LocFooter.clickNykaaMan, 2, Hooks.test);
            wb.scrollByToFooter(Hooks.test);
            wb.waitForElementToBeVisible(LocFooter.clickNykaaMan, 2, Hooks.test);
            wb.scrollByToFooter(Hooks.test);

        }
           
}
