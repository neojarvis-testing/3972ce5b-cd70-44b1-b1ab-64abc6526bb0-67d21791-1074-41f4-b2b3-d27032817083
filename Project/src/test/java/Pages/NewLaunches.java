package Pages;


import stepdefinition.Hooks;
import uistore.NewLaunchesLoc;
import utils.AssertionUtility;
import utils.Base;
import utils.ExcelFileReader;
import utils.WebDriverHelper;

/**
 * Represents functionality related to the 'New Launches' section.
 * Provides methods to interact with elements such as hovering over fragrance,
 * clicking on new launches, and verifying the displayed information.
 * 
 * @author Pratik
 * 
 */
public class NewLaunches {
    WebDriverHelper helper=new WebDriverHelper(Base.driver); 
   public void newLaunches() { 
        
        helper.hoverOverElement(NewLaunchesLoc.fragrance,Hooks.test); 

        helper.clickOnElement(NewLaunchesLoc.newlaunches, Hooks.test);
        
        try{ 
            Thread.sleep(2000);
        }
        catch(Exception e){ 
            e.printStackTrace();
        }
        
        helper.switchToWindow(1, Hooks.test);
        
        helper.waitForElementToBeVisible(NewLaunchesLoc.newLaunchesVerify, 5, Hooks.test);
        AssertionUtility.useAssertEquals(helper.getText(NewLaunchesLoc.newLaunchesVerify,Hooks.test),ExcelFileReader.readData(Base.prop.getProperty("sheet1"), 26, 0, Hooks.test) , Hooks.test);

    } 

}
