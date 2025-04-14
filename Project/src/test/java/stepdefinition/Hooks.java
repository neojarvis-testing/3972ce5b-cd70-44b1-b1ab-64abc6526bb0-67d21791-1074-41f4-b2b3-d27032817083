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

public class Hooks extends Base {
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeAll
    public static void beforeA() {
        reports = Reporter.generateExtentReport("Nyka_web");
    }

    @Before
    public void before(Scenario sc) {
        try {
            openBrowser();
            test = reports.createTest(sc.getName());
        } catch (Exception e) {
        }

    }

    @After
    public void after() {
        driver.quit();
    }

    @AfterAll
    public static void afterA() {
        reports.flush();
    }

}