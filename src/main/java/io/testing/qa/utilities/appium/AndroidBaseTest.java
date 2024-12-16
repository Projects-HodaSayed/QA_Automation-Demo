package io.testing.qa.utilities.appium;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class AndroidBaseTest extends AbstractAppiumBase {
    @BeforeSuite(alwaysRun = true)
    public void configureAppium(){
        try {
            System.out.println("Configure Appium in Before suite");
            loadOnSuiteStartup();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest(alwaysRun = true)
    public void tearDownAppium() {
        System.out.println("TearDown Appium");
        closeAppiumServer();
    }
}
