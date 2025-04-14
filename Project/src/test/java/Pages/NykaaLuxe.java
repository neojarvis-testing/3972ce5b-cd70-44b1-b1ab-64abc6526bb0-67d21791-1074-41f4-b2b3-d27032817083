package Pages;


import com.aventstack.extentreports.ExtentTest;

import stepdefinition.Hooks;
import uistore.NykaaLuxeLoc;
import utils.AssertionUtility;
import utils.Base;
import utils.ExcelFileReader;
import utils.WebDriverHelper;

/**
 * Creator: Kumaran
 * 
 * Description: class contains methods to interact with the Nykaa Luxe page.
 * 
 */
public class NykaaLuxe {

    WebDriverHelper helper = new WebDriverHelper(Base.driver);

    /**
     *
     *Description: This method verifies the title of the Luxe page.
     *     
     */
    public void luxeVerify(ExtentTest test) {
        String actual = Base.driver.findElement(NykaaLuxeLoc.titleLuxe).getText();
        String expected = ExcelFileReader.readData("Sheet1", 21, 0, test);
        AssertionUtility.useAssertTrue(actual, expected, test);

    }

    /**
     * Description: This method sorts and filters products on the Luxe page.
     *     
     */
    public void luxeSortAndFilter(ExtentTest test) {
        helper.hoverAndClick(test, NykaaLuxeLoc.sorter, NykaaLuxeLoc.sorter);
        helper.hoverAndClick(test, NykaaLuxeLoc.sortbyCustomerTopRated,
                NykaaLuxeLoc.sortbyCustomerTopRated);
        helper.hoverAndClick(test, NykaaLuxeLoc.genderFilter, NykaaLuxeLoc.genderFilter);
        helper.hoverAndClick(test, NykaaLuxeLoc.unisex, NykaaLuxeLoc.unisex);
        String actualFilter = Base.driver.findElement(NykaaLuxeLoc.filterApplied).getText();
        String expectedFilter = ExcelFileReader.readData("Sheet1", 22, 0, test);
        AssertionUtility.useAssertEquals(actualFilter, expectedFilter, test);
        helper.hoverAndClick(test, NykaaLuxeLoc.ocassionFilter, NykaaLuxeLoc.ocassionFilter);
        helper.hoverAndClick(test, NykaaLuxeLoc.dayWear, NykaaLuxeLoc.dayWear);

    }

    /**
     * Description: This method clicks on the first product in the list and switches to the new window.
     *     
     */
    public void firstProductClick(ExtentTest test) {
        helper.hoverAndClick(test, NykaaLuxeLoc.firstProduct, NykaaLuxeLoc.firstProduct);
        helper.switchToWindow(2, test);
    }

    /**
     * Description: This method performs a series of actions on the Luxe page: verifying the title,sorting and filtering products, and clicking on the first product.
     *     
     */
    public void luxe() {
        luxeVerify(Hooks.test);
        luxeSortAndFilter(Hooks.test);
        firstProductClick(Hooks.test);
    }

}