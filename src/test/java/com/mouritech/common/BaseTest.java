package com.mouritech.common;

import com.anhtester.listeners.AllureListener;
import com.anhtester.listeners.TestListener;
import com.mouritech.driver.DriverManager;
import com.mouritech.driver.TargetFactory;
import com.mouritech.helpers.PropertiesHelpers;
import com.mouritech.projects.saucelabs.CommonPageCMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.annotations.*;

@Listeners({TestListener.class})
public class BaseTest extends CommonPageCMS {

    @Parameters("BROWSER")
    @BeforeMethod
    public void createDriver(@Optional("chrome") String browser) {
        WebDriver driver = ThreadGuard.protect(new TargetFactory().createInstance(browser));
        DriverManager.setDriver(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        DriverManager.quit();
    }

	
	  public WebDriver createBrowser(@Optional("chrome") String browser) {
	 PropertiesHelpers.loadAllFiles(); WebDriver driver = ThreadGuard.protect(new
	 TargetFactory().createInstance(browser));
	 driver.manage().window().maximize(); DriverManager.setDriver(driver); return
	 DriverManager.getDriver(); }
	 

}
