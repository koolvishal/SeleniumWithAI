package com.mouritech.projects.saucelabs.testcases;

import com.mouritech.common.BaseTest;
import com.mouritech.constants.FrameworkConstants;
import com.mouritech.helpers.ExcelHelpers;
import com.mouritech.projects.saucelabs.users.pages.dashboard.DashboardPage;
import com.mouritech.utils.DataFakerUtils;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import net.datafaker.Faker;

import org.testng.annotations.Test;

@Epic("Regression Test CMS")
@Feature("Login Test")
public class EndToEndTest extends BaseTest {
    @Test(priority = 1, invocationCount=3)
    public void TC_EndToEndTest() {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_LOGIN, "Login");
        DataFakerUtils testDataAI = new DataFakerUtils();
        Faker dataGenerator = testDataAI.getFaker();
        getLogipage().loginToAPP(excel.getCellData(1, "email"), excel.getCellData(1, "password"));
        getDashboardPage().addProducts();
        getDashboardPage().clickOncart();
        getcartPage().verifyYourCartLabel();
        getcartPage().clickCheckOut();
        getCustInfoPage().VerifyYourInfoLabel();
        String strName = dataGenerator.name().firstName();
        String strLastName = dataGenerator.name().lastName();
        String strZipCode = dataGenerator.address().zipCode();
        getCustInfoPage().EnterCustomerInformation(strName,strLastName,strZipCode);
        getCustInfoPage().ClickOnContinue();
        getCheckOutPage().VerifyYourInfoLabel();
        getCheckOutPage().ClickOnContinue();
        
    }


}
