package com.mouritech.projects.saucelabs.testcases;

import com.mouritech.common.BaseTest;
import com.mouritech.constants.FrameworkConstants;
import com.mouritech.helpers.ExcelHelpers;
import com.mouritech.projects.saucelabs.users.pages.dashboard.DashboardPage;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("Regression Test CMS")
@Feature("Login Test")
public class DashboardTest extends BaseTest {
    @Test(priority = 1)
    public void TC_DashboardTest() {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_LOGIN, "Login");
        getLogipage().loginSuccessWithCustomerAccount(excel.getCellData(1, "email"), excel.getCellData(1, "password"));
        getDashboardPage().addProducts();
    }


}
