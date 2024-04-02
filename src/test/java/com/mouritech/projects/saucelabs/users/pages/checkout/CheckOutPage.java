package com.mouritech.projects.saucelabs.users.pages.checkout;

import static com.mouritech.keywords.WebUI.*;
import com.mouritech.projects.saucelabs.CommonPageCMS;
import com.mouritech.projects.saucelabs.users.pages.dashboard.DashboardPage;
import com.mouritech.projects.saucelabs.users.pages.login.LoginPage;
import com.mouritech.utils.DataGenerateUtils;
import com.pengrad.telegrambot.model.request.InputTextMessageContent;

import static com.mouritech.keywords.WebUI.verifyElementVisible;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CheckOutPage extends CommonPageCMS {

    private By lblCheckOutInfo = By.xpath("//span[@class='title']");
    private By btnFiish = By.xpath("//button[@id='finish']");
    
    public void VerifyYourInfoLabel()
    {
    	sleep(2);
    	verifyElementVisible(lblCheckOutInfo, "CheckOut information label is NOT displayed.");
    	
    }
    
    
    public void ClickOnContinue()
    {
    	sleep(2);
    	clickElement(btnFiish);
    }
    


   
   
   

}
