package com.mouritech.projects.saucelabs.users.pages.login;


import org.openqa.selenium.By;

import com.mouritech.constants.FrameworkConstants;
import com.mouritech.helpers.PropertiesHelpers;
import static com.mouritech.keywords.WebUI.*;
import com.mouritech.projects.saucelabs.CommonPageCMS;
import com.mouritech.projects.saucelabs.users.pages.dashboard.DashboardPage;


public class LoginPage extends CommonPageCMS{

	public static By titleLoginPage = By.xpath("//div[contains(text(),'Swag Labs')]");
	private By inputEmail = By.xpath("//input[@id='user-name']");
    private By inputPassword = By.xpath("//input[@id='password']");
    private By buttonSubmitLogin = By.xpath("//input[@name='login-button']");
	
	public void openLoginPage() {
		openWebsite(FrameworkConstants.URL_SauceLabs);
        //clickElement(closeAdvertisementPopup);
        //clickElement(buttonCookies);
        //clickElement(buttonLogin);
        waitForPageLoaded();
        verifyElementVisible(titleLoginPage, "Login page is displayed");
    }
	
	

	public void loginSuccessWithCustomerAccount(String email, String password) {
		// TODO Auto-generated method stub
		 	openLoginPage();
		 	sleep(40);
	        setText(inputEmail, email);
	        clearText(inputPassword);
	        setText(inputPassword, password);
	        clickElement(buttonSubmitLogin);
	        waitForPageLoaded();
	        sleep(1);
	        waitForElementVisible(DashboardPage.titleDashboard);
	        verifyElementVisible(DashboardPage.titleDashboard, "Dashboard page is NOT displayed.");
		
	}
	
	public void loginToAPP(String email, String password) {
		// TODO Auto-generated method stub
		 	openLoginPage();
	        setText(inputEmail, email);
	        clearText(inputPassword);
	        setText(inputPassword, password);
	        clickElement(buttonSubmitLogin);
	        waitForPageLoaded();
	        sleep(1);
	        waitForElementVisible(DashboardPage.titleDashboard);
	        verifyElementVisible(DashboardPage.titleDashboard, "Dashboard page is NOT displayed.");
		
	}

	
}
