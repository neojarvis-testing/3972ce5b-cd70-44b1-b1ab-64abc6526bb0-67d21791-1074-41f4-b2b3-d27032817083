package Pages;



import stepdefinition.Hooks;
import uistore.TermsConditionsLoc;
import utils.AssertionUtility;
import utils.Base;
import utils.ExcelFileReader;
import utils.WebDriverHelper;

/**
 * Represents functionality related to the 'Terms and Conditions' section.
 * Provides methods to interact with elements such as the Shipping Policy and Privacy Policy, 
 * and validates their content using assertions.
 * 
 * @author Pratik
 * 
 */
public class TermsConditions {
    
    WebDriverHelper helper=new WebDriverHelper(Base.driver); 
    /**
     * Executes the workflow for interacting with the 'Terms and Conditions' section.
     * Includes clicking on the Shipping Policy and Privacy Policy, and verifying 
     * the displayed text matches the expected data using assertions.
     * 
     * @param Hooks.test ExtentHooks.test instance for reporting.
     * 
     * @author Pratik
     * 
     */
    public void termsAndCondition() { 
        helper.hoverAndClick(Hooks.test, TermsConditionsLoc.shippingPolicy, TermsConditionsLoc.shippingPolicy); 

        AssertionUtility.useAssertTrue(ExcelFileReader.readData(Base.prop.getProperty("sheet1"), 3, 0, Hooks.test),helper.getText(TermsConditionsLoc.processWork, Hooks.test),Hooks.test); 

        helper.clickOnElement(TermsConditionsLoc.privacyPolicy, Hooks.test);
        
        AssertionUtility.useAssertTrue(ExcelFileReader.readData(Base.prop.getProperty("sheet1"),4, 0, Hooks.test),helper.getText(TermsConditionsLoc.processWork, Hooks.test),Hooks.test); 
        helper.waitForElementToBeVisible(TermsConditionsLoc.privacyPolicy, 10, Hooks.test);
    }
}
