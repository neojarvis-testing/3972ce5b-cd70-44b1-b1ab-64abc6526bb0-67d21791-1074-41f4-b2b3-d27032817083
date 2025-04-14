package stepdefinition;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base{
    public static ExtentReports reports; 
    public static ExtentTest test; 
    

    @BeforeAll
    public static void beforeA(){ 
        reports=Reporter.generateExtentReport("Cucumber");
    }

    @Before
    public void before(Scenario s) { 
        openBrowser();
        test=reports.createTest(s.getName());
    
    }

    @After
    public void after(){ 
        driver.quit();
    }

    @AfterAll
    public static void afterA(){ 
        reports.flush();
    }
    
}



