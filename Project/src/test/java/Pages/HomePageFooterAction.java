package Pages;

import stepdefinition.Hooks;
import uistore.HomePageFooterLoc;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageFooterAction {
    static WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    /**
     * Description: Performs actions to click on the "New Launches" section by
     * scrolling,
     * hovering, and switching to the appropriate window.
     *
     * @param test ExtentTest object for logging and reporting.
     * @return void
     * @author Harshit
     */
    public static void clickNewLaunches() {
        try {

            driverHelper.scrollAndClickByPixels(Hooks.test, HomePageFooterLoc.clickNewLaunches);
            driverHelper.hoverAndClick(Hooks.test, HomePageFooterLoc.clickNewLaunches, HomePageFooterLoc.clickNewLaunches);

            driverHelper.switchInToWindown();
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}
