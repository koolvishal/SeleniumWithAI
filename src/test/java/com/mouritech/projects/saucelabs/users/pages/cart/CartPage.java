package com.mouritech.projects.saucelabs.users.pages.cart;

import static com.mouritech.keywords.WebUI.*;
import com.mouritech.projects.saucelabs.CommonPageCMS;
import com.mouritech.projects.saucelabs.users.pages.login.LoginPage;
import com.mouritech.utils.DataGenerateUtils;

import static com.mouritech.keywords.WebUI.verifyElementVisible;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CartPage extends CommonPageCMS {

    private By lblYourCart = By.xpath("//span[@class='title']");
    private By btnCheckOut = By.xpath("//button[@name='checkout']");
    
    public void verifyYourCartLabel()
    {
    	sleep(2);
    	verifyElementVisible(LoginPage.titleLoginPage, "Login Page is NOT displayed.");
    }
    
    public void clickCheckOut()
    {
    	sleep(2);
    	clickElement(btnCheckOut);
    }
    


   
   
   

}
