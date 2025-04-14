package Pages;



import stepdefinition.Hooks;
import uistore.NykaaHomePageLoc;
import utils.Base;
import utils.ExcelFileReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class NykaaHomeSearch {

    WebDriverHelper help = new WebDriverHelper(Base.driver);

/**
 * Description:
 * This method performs the search functionality for pillow products on the homepage.
 * It waits for the search element to be visible, inputs data from an Excel file,
 * and executes the search action.
 *
 * @param Hooks.test ExtentHooks.test object for logging and reporting.
 * @return void
 * @author Tharikaa Srinithi
 */
    public void homeSearchPillow(String data) {
        try {
            help.waitForElementToBeVisible(NykaaHomePageLoc.search, 3, Hooks.test);
            help.clickOnElement(NykaaHomePageLoc.search, Hooks.test);
            
            help.sendKeys(NykaaHomePageLoc.search, data, Hooks.test, "placeholder");
            help.enterAction(NykaaHomePageLoc.search, Hooks.test);
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }


 /**
 * Description:
 * This method handles the search functionality for Kurta products on Nykaa's homepage.
 *
 * @return void
 * @author Tharikaa
 */
    public void homeSearchKurta(String data) {

        try {
            help.waitForElementToBeVisible(NykaaHomePageLoc.search, 3, Hooks.test);
            help.clickOnElement(NykaaHomePageLoc.search, Hooks.test);
            
            help.sendKeys(NykaaHomePageLoc.search, data, Hooks.test, "placeholder");
            help.enterAction(NykaaHomePageLoc.search, Hooks.test);
        }

        catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

}
