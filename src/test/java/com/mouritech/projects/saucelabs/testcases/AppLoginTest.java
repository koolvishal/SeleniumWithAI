package com.mouritech.projects.saucelabs.testcases;

import com.mouritech.common.BaseTest;
import com.mouritech.constants.FrameworkConstants;
import com.mouritech.helpers.ExcelHelpers;
import com.mouritech.utils.DataFakerUtils;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import net.datafaker.Faker;
import net.datafaker.providers.base.Text;

import org.testng.annotations.Test;

@Epic("Regression Test CMS")
@Feature("Login Test")
public class AppLoginTest extends BaseTest {
    @Test(priority = 1)
    public void TC_loginToAPP() {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_LOGIN, "Login");
        getLogipage().loginToAPP(excel.getCellData(1, "email"), excel.getCellData(1, "password"));
        
    }


}
