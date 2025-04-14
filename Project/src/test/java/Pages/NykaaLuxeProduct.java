package Pages;


import stepdefinition.Hooks;
import uistore.NykaaFooterLoc;
import utils.Base;
import utils.WebDriverHelper;


/**
 * Creator: Kumaran
 * 
 * Description: class contains methods to interact with the Nykaa Luxe product page.
 */
public class NykaaLuxeProduct {
    
    WebDriverHelper helper = new WebDriverHelper(Base.driver);

    
    /**
     * Description: This method scrolls to the footer of the page and clicks on the 'Nykaa Man' link.
     * 
     */
    public void footerNykaaManClick()
    {
        helper.scrollByToFooter(Hooks.test);
        helper.scrollByToFooter(Hooks.test);
        helper.hoverAndClick(Hooks.test, NykaaFooterLoc.footerNykaaMan,NykaaFooterLoc.footerNykaaMan);
        helper.switchToWindow(3,Hooks.test);
    }
}