package com.mouritech.projects.saucelabs.users.pages.cutomerInfo;

import static com.mouritech.keywords.WebUI.*;
import com.mouritech.projects.saucelabs.CommonPageCMS;
import com.mouritech.projects.saucelabs.users.pages.dashboard.DashboardPage;
import com.mouritech.projects.saucelabs.users.pages.login.LoginPage;
import com.mouritech.utils.DataGenerateUtils;
import com.pengrad.telegrambot.model.request.InputTextMessageContent;

import static com.mouritech.keywords.WebUI.verifyElementVisible;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CustomerInfoPage extends CommonPageCMS {

    private By lblYourIformation = By.xpath("//span[@class='title']");
    private By txtFirstName = By.xpath("//input[@id='first-name']");
    private By txtLastName = By.xpath("//input[@id='last-name']");
    private By txtZipCode = By.xpath("//input[@id='postal-code']");
    private By btnContinue = By.xpath("//input[@name='continue']");
    
    public void VerifyYourInfoLabel()
    {
    	sleep(2);
    	verifyElementVisible(lblYourIformation, "Your Information is NOT displayed.");
    	
    }
    
    public void EnterCustomerInformation(String strName,String strLastName,String strZipCode)
    {
    	sleep(2);
    	clickElement(txtFirstName);
    	setText(txtFirstName, strName);
    	clickElement(txtLastName);
    	setText(txtLastName, strLastName);
    	clickElement(txtZipCode);
    	setText(txtZipCode, strZipCode);
    	
    }
    
    public void ClickOnContinue()
    {
    	sleep(2);
    	clickElement(btnContinue);
    }
    


   
   
   

}
