package Pages;



import stepdefinition.Hooks;
import uistore.NykaaKurtaProductLoc;
import utils.Base;
import utils.WebDriverHelper;

public class NykaaKurtaProduct {

    WebDriverHelper help = new WebDriverHelper(Base.driver);

/**
 * Description:
 * This method validates and interacts with Kurta product elements, including size guide, reviews, and helpful votes.
 *
 * @param Hooks.test ExtentHooks.test object for logging and reporting.
 * @return void
 * @author Tharikaa
 */
    public void kurtaProduct()
    {
      help.waitForElementToBeVisible(NykaaKurtaProductLoc.SizeGuide,3 ,Hooks.test);
      help.clickOnElement(NykaaKurtaProductLoc.SizeGuide, Hooks.test);
      boolean newtext2 = Base.driver.findElement(NykaaKurtaProductLoc.SizeGuide).isDisplayed();
      System.out.println(newtext2);
      help.waitForElementToBeVisible(NykaaKurtaProductLoc.XButton,4 ,Hooks.test);
      help.clickOnElement(NykaaKurtaProductLoc.XButton, Hooks.test);
      help.hoverAndClick(Hooks.test, NykaaKurtaProductLoc.ReadAllViews, NykaaKurtaProductLoc.ReadAllViews);
      boolean newtext3 = Base.driver.findElement(NykaaKurtaProductLoc.ReadAllViews).isDisplayed();
      System.out.println(newtext3);
      help.hoverAndClick(Hooks.test,NykaaKurtaProductLoc.helpful,NykaaKurtaProductLoc.helpful);
  
    }
}
