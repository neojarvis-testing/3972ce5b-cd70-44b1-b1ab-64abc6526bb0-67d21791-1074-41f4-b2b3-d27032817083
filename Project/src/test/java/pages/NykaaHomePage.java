package pages;

import stepdefinition.Hooks;
import uistore.NykaaFooterLoc;
import utils.Base;
import utils.WebDriverHelper;

/**
 * Creator: Kumaran
 * 
 * Description: class contains methods to interact with the Nykaa home page.
 * 
 */
public class NykaaHomePage {
    
    WebDriverHelper helper = new WebDriverHelper(Base.driver);

    
    /**
     * Description: This method scrolls to the footer of the page and clicks on the 'Luxe' link.
     * 
     */
    public void footerLuxeClick()
    {
        helper.scrollByToFooter(Hooks.test);
        helper.scrollByToFooter(Hooks.test);
        helper.hoverAndClick(Hooks.test, NykaaFooterLoc.footerLuxe, NykaaFooterLoc.footerLuxe);
        helper.switchToWindow(1,Hooks.test);
    }
    

}