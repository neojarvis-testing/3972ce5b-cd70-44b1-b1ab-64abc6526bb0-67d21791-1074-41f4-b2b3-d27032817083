package Pages;


import stepdefinition.Hooks;

import uistore.HomePageLoc;

import utils.Base;

import utils.WebDriverHelper;

/**
 * Represents actions and interactions available on the Home Page.
 * Provides methods to interact with elements like the 'Get App' feature.
 * 
 * @author Pratik
 */
public class HomePageAct {
    WebDriverHelper helper=new WebDriverHelper(Base.driver); 
    
    /**
     * Interacts with the 'Get App' section by hovering, clicking on the element,
     * and switching to the newly opened window.
     * 
     * @param test ExtentTest instance for reporting.
     * @author Pratik
     */
    public void getApp() { 
        helper.hoverAndClick(Hooks.test, HomePageLoc.getApp, HomePageLoc.getApp); 

        helper.switchToWindow(1,Hooks.test); 
    }
    
}
