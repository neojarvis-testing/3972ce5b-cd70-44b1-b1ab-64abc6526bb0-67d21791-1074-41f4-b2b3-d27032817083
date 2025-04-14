package Pages;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.messages.types.Hook;
import stepdefinition.Hooks;
import uistore.LocFirstProduct;
import uistore.LocFooter;
import uistore.LocNykaaMan;
import utils.AssertionUtility;
import utils.Base;
import utils.ExcelFileReader;
import utils.WebDriverHelper;

public class TestCaseTenModuleTwo {
    
    WebDriverHelper wb = new WebDriverHelper(Base.driver);
    public void nykaaMan(ExtentTest test) {
           
            wb.clickOnElement(LocFooter.clickNykaaMan, test);
            Base.driver.navigate().to(Base.prop.getProperty("url"));
            
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            wb.hoverOverElement(LocNykaaMan.clickHealth, test);
            wb.clickOnElement(LocNykaaMan.clickWheyProtein, test);
            try{
                Thread.sleep(4000);
              }
              catch(Exception e){
                e.printStackTrace();
              }
            wb.switchToWindow(2,Hooks.test);
            try{
                Thread.sleep(2000);
              }
              catch(Exception e){
                e.printStackTrace();
              }
            AssertionUtility.useAssertEquals(wb.getText(LocNykaaMan.verifyThree, test), ExcelFileReader.readData( "Sheet1", 5, 0, test), test);

        }

    public void nykaaScroll(ExtentTest test)  {
       
        wb.scrollByToFooter(test);
        wb.clickOnElement(LocNykaaMan.clickPageTwo,test);
        wb.waitForElementToBeVisible(LocNykaaMan.clickPageTwo,5,test);
    }

    public void nykaaSwitch(ExtentTest test) {
        
        wb.hoverOverElement(LocNykaaMan.clickFirstProd, test);
        wb.waitForElementToBeVisible(LocFirstProduct.clickPincode, 3, test);
        wb.clickOnElement(LocNykaaMan.clickFirstProd, test);
        try{
            Thread.sleep(2000);
          }
          catch(Exception e){
            e.printStackTrace();
          }
        wb.switchToWindow(3, test);
        try{
            Thread.sleep(2000);
          }
          catch(Exception e){
            e.printStackTrace();
          }
    }


public void nykaaManPage() {
    nykaaMan(Hooks.test);
    nykaaScroll(Hooks.test);
    nykaaSwitch(Hooks.test);

}

}

