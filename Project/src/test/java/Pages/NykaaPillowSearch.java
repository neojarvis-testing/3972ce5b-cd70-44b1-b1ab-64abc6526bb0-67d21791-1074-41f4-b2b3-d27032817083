package Pages;

import com.aventstack.extentreports.ExtentTest;

import stepdefinition.Hooks;
import uistore.NykaaPillowSearchLoc;
import utils.Base;
import utils.WebDriverHelper;

public class NykaaPillowSearch {

    WebDriverHelper help = new WebDriverHelper(Base.driver);

    /**
 * Description:
 * This method validates the presence of a pillow search result on Nykaa by checking its visibility.
 *
 * @param test ExtentTest object for logging and reporting.
 * @return void
 * @autor Tharikaa
 */
    public void PillowSearch(ExtentTest test) {
        help.waitForElementToBeVisible(NykaaPillowSearchLoc.verifypillow, 4, test);

        boolean newtext = Base.driver.findElement(NykaaPillowSearchLoc.verifypillow).isDisplayed();
        System.out.println(newtext);
    }


/**
 * Description:
 * This method applies filters to the pillow search results, including price, discount, and average customer rating.
 *
 * @param test ExtentTest object for logging and reporting.
 * @return void
 * @autor Tharikaa
 */
    public void filterPillowSearch(ExtentTest test)
    {

        help.clickOnElement(NykaaPillowSearchLoc.price, test);

        help.waitForElementToBeVisible(NykaaPillowSearchLoc.priceDropdown, 4, test);

        help.clickOnElement(NykaaPillowSearchLoc.priceDropdown, test);

        help.waitForElementToBeVisible(NykaaPillowSearchLoc.Discount, 4, test);
        help.clickOnElement(NykaaPillowSearchLoc.Discount, test);

        help.waitForElementToBeVisible(NykaaPillowSearchLoc.DiscountThirdOption, 4, test);
        help.clickOnElement(NykaaPillowSearchLoc.DiscountThirdOption, test);

        help.waitForElementToBeVisible(NykaaPillowSearchLoc.AvgCustomerRating, 4, test);
        help.clickOnElement(NykaaPillowSearchLoc.AvgCustomerRating, test);

        help.waitForElementToBeVisible(NykaaPillowSearchLoc.AvgCustomerRatingFirstOption, 4, test);
        help.clickOnElement(NykaaPillowSearchLoc.AvgCustomerRatingFirstOption, test);

    }

/**
 * Description:
 * This method clicks on the first pillow product and switches to its detailed view in a new window.
 *
 * @param test ExtentTest object for logging and reporting.
 * @return void
 * @author Tharikaa
 */
    public void clickfirstProductPillow(ExtentTest test)
    {

        help.waitForElementToBeVisible(NykaaPillowSearchLoc.firstproduct, 4, test);
        help.clickOnElement(NykaaPillowSearchLoc.firstproduct, test);

        help.switchToWindow(1,test);
        try{ 
            Thread.sleep(5000);
        }
        catch(Exception e){ 
            e.printStackTrace();
            
        }
    }


/**
 * Description:
 * This method orchestrates the pillow search process by validating results, applying filters, and selecting a product.
 *
 * @param test ExtentTest object for logging and reporting.
 * @return void
 * @author Tharikaa
 */
    public void pillowSearch()
    {
        PillowSearch(Hooks.test);
        filterPillowSearch(Hooks.test);
        clickfirstProductPillow(Hooks.test);
    }
}
