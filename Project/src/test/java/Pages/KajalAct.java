package Pages;

import org.openqa.selenium.Keys;


import stepdefinition.Hooks;

import uistore.KajalLoc;

import utils.AssertionUtility;
import utils.Base;
import utils.ExcelFileReader;
import utils.WebDriverHelper;

/**
 * Represents functionality related to the Kajal product section.
 * Provides methods to search for Kajal products, perform validations, 
 * and interact with formulations.
 * 
 * @author Pratik
 * 
 */
public class KajalAct {
    WebDriverHelper helper=new WebDriverHelper(Base.driver); 


    /**
     * Executes the workflow for selecting Kajal products by calling
     * relevant methods for searching and interacting with formulations.
     * 
     * @author Pratik
     */
    public void getKajal() {  
        sendKajal(); 
        formuPencil();

    }

    /**
     * Searches for Kajal products by interacting with the search bar,
     * verifying categories, and using assertions to ensure the displayed 
     * text matches expected data.
     * 
     * @param Hooks.test ExtentHooks.test instance for reporting.
     * @author Pratik
     */
    public void sendKajal() { 

        AssertionUtility.useAssertEquals(helper.getText(KajalLoc.categories, Hooks.test),ExcelFileReader.readData(Base.prop.getProperty("sheet1").toLowerCase(), 24, 0, Hooks.test) , Hooks.test);

        helper.clickOnElement(KajalLoc.searchBar,Hooks.test,"placeholder");  

        try { 
            Thread.sleep(2000);
        }
        catch(Exception e){ 
            e.printStackTrace(); 
        }
        
        helper.sendKeys(KajalLoc.searchBar, ExcelFileReader.readData(Base.prop.getProperty("sheet1"), 25, 0, Hooks.test), Hooks.test, "placeholder");  

        AssertionUtility.useAssertEquals(helper.getText(KajalLoc.searchBar, Hooks.test),ExcelFileReader.readData(Base.prop.getProperty("sheet1").toLowerCase(), 25, 0, Hooks.test) , Hooks.test);

        Base.driver.findElement(KajalLoc.searchBar).sendKeys(Keys.ENTER);  

        AssertionUtility.useAssertTrue(helper.getText(KajalLoc.kajalVerify,Hooks.test),ExcelFileReader.readData(Base.prop.getProperty("sheet1"), 25, 0, Hooks.test),Hooks.test); 
    } 

    /**
     * Interacts with the Kajal formulations section by hovering and clicking 
     * on formulation and pencil options. Scrolls the page back afterward.
     * 
     * @param Hooks.test ExtentHooks.test instance for reporting.
     * @author Pratik
     */
    public void formuPencil() { 
        helper.hoverAndClick(Hooks.test, KajalLoc.formulation, KajalLoc.formulation);

        helper.hoverAndClick(Hooks.test, KajalLoc.pencil, KajalLoc.pencil); 
        helper.scrollBack(Hooks.test);
    }

    

    
}
