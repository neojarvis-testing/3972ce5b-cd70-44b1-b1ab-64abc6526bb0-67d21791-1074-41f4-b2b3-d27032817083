package Pages;
import stepdefinition.Hooks;
import uistore.NykaaKurtaLoginLoc;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class NykaaKurtaLogin {

  WebDriverHelper help = new WebDriverHelper(Base.driver);

  /**
 * Description:
 * This method handles the login functionality for Kurta purchases on Nykaa.
 *
 * @param Hooks.test ExtentHooks.test object for logging and reporting.
 * @return void
 * @author Tharikaa
 */
  public void kurtaLogin() {
    try{
      Thread.sleep(4000);
    }
    catch(Exception e){
      e.printStackTrace();
    }
    help.clickOnElement(NykaaKurtaLoginLoc.mobile, Hooks.test);
    try{
      Thread.sleep(4000);
    }
    catch(Exception e){
      e.printStackTrace();
    }
    
    help.sendKeys(NykaaKurtaLoginLoc.mobile, "9876543210", Hooks.test, "name");
    try{
      Thread.sleep(4000);
    }
    catch(Exception e){
      e.printStackTrace();
    }
    help.waitForElementToBeVisible(NykaaKurtaLoginLoc.submit, 3, Hooks.test);
    help.clickOnElement(NykaaKurtaLoginLoc.submit, Hooks.test);
    Screenshot.captureScreenshot(Base.driver, Hooks.test, "Login.png");
    LoggerHandler.info("Login Page");
  }

}
