package com.mouritech.projects.saucelabs;

import com.mouritech.projects.saucelabs.users.pages.cart.CartPage;
import com.mouritech.projects.saucelabs.users.pages.checkout.CheckOutPage;
import com.mouritech.projects.saucelabs.users.pages.cutomerInfo.CustomerInfoPage;
import com.mouritech.projects.saucelabs.users.pages.dashboard.DashboardPage;
import com.mouritech.projects.saucelabs.users.pages.login.LoginPage;
import com.mouritech.projects.saucelabs.users.pages.profiles.ProfilePage;

import static com.mouritech.keywords.WebUI.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CommonPageCMS {

    //private LoginPageCMS loginPage;
    //private BrandPage brandPage;
    //private CategoryPage categoryPage;
  
	private LoginPage loginPage;
    private ProfilePage profilePage;
    private DashboardPage dashboardPage;
    private CartPage cartPage;
    private CustomerInfoPage custInfoPage;
    private CheckOutPage checkoutPage;

   /* public LoginPageCMS getLoginPageCMS() {
        if (loginPage == null) {
            loginPage = new LoginPageCMS();
        }
        return loginPage;
    }*/
    
    public LoginPage getLogipage()
    {
    	if(loginPage==null)
    	{
    		loginPage=new LoginPage();
    	}
		return loginPage;
    }

    public ProfilePage getProfilePage() {
        if (profilePage == null) {
            profilePage = new ProfilePage();
        }
        return profilePage;
    }

   
    
    public DashboardPage getDashboardPage() {
        if (dashboardPage == null) {
        	dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }
    
    public CartPage getcartPage() {
        if (cartPage == null) {
        	cartPage = new CartPage();
        }
        return cartPage;
    }
    
    public CustomerInfoPage getCustInfoPage() {
        if (custInfoPage == null) {
        	custInfoPage = new CustomerInfoPage();
        }
        return custInfoPage;
    }
    
    public CheckOutPage getCheckOutPage() {
        if (checkoutPage == null) {
        	checkoutPage = new CheckOutPage();
        }
        return checkoutPage;
    }

   

    private By menuProducts = By.xpath("//span[normalize-space()='Products']");
    private By menuCategory = By.xpath("//span[normalize-space()='Category']");
    private By menuBrand = By.xpath("//span[normalize-space()='Brand']");
    private By menuAddNewProduct = By.xpath("//span[normalize-space()='Add New Product']");
    private By menuAllProducts = By.xpath("//span[normalize-space()='All products']");
    private By messageNotify = By.xpath("//span[@data-notify='message']");
    private By buttonEdit = By.xpath("(//a[@title='Edit'])[1]");
    private By buttonSave = By.xpath("//button[normalize-space()='Save']");
    private By inputSearch = By.xpath("//input[@id='search']");
    public By avatarProfile = By.xpath("//span[contains(@class,'avatar avatar-sm')]");
    public By buttonCookies = By.xpath("//button[normalize-space()='Ok. I Understood']");


    public void enterDataOnSearchDataTable(String value) {
        setText(inputSearch, value, Keys.ENTER);
    }

    public void clickEditButton() {
        clickElement(buttonEdit);
    }
    public void clickSaveButton() {
        clickElement(buttonSave);
    }

    public String getMessageNotify() {
        return getTextElement(messageNotify);
    }

    public CommonPageCMS clickMenuProducts() {
        clickElement(menuProducts);
        return this;
    }

    /*public CategoryPage clickMenuCategory() {
        clickElement(menuCategory);
        return new CategoryPage();
    }*/
    
    /*

    public BrandPage clickMenuBrand() {
        clickElement(menuProducts);
        return new BrandPage();
    }*/

}
