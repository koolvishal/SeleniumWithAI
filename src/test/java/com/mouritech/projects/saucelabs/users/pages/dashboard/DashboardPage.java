package com.mouritech.projects.saucelabs.users.pages.dashboard;

import static com.mouritech.keywords.WebUI.clearText;
import static com.mouritech.keywords.WebUI.clickElement;
import static com.mouritech.keywords.WebUI.setText;
import static com.mouritech.keywords.WebUI.sleep;
import static com.mouritech.keywords.WebUI.verifyElementVisible;
import static com.mouritech.keywords.WebUI.waitForElementVisible;
import static com.mouritech.keywords.WebUI.waitForPageLoaded;

import org.openqa.selenium.By;

import com.mouritech.projects.saucelabs.CommonPageCMS;
import com.mouritech.projects.saucelabs.users.pages.login.LoginPage;

public class DashboardPage extends CommonPageCMS{
    public static By titleDashboard = By.xpath("//div[@class='app_logo']");
    public static By btnsuacelabsBackpack = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static By btnsuacelabsBackLight = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    public static By btnMenu = By.xpath("//button[@id='react-burger-menu-btn']");
    public static By btnLogOut = By.xpath("//a[@id='logout_sidebar_link']");
    public static By btnCheckcart = By.xpath("//a[@class='shopping_cart_link']");
    
    
    public void addProducts() {
		// TODO Auto-generated method stub
		 sleep(2);
	     clickElement(btnsuacelabsBackpack);
	     sleep(2);
	     clickElement(btnsuacelabsBackLight);
	     sleep(1);
	     //waitForElementVisible(DashboardPage.btnMenu);
	     verifyElementVisible(DashboardPage.btnMenu, "Menu button is NOT displayed.");
	     sleep(2);
	     //clickElement(btnMenu);
	    //sleep(2);
	     //clickElement(btnLogOut);
	     //verifyElementVisible(LoginPage.titleLoginPage, "Login Page is NOT displayed.");
	        
	}
    
    public void clickOncart()
    {
    	sleep(2);
        clickElement(btnCheckcart);
        sleep(2);
    }
    
    
}
