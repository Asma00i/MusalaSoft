package tests;

import base.BaseTest;
import data.ExcelReader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


public class ContactUsTest extends BaseTest {


    @DataProvider(name = "ExcelData")
    public Object[][] enterUserData() throws IOException {
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData();
    }

    @Test(dataProvider = "ExcelData")
//    @Test
    public void testFailedContactUs(String name, String email, String mobile, String subject, String message) {

        homePage.clickAcceptWebCookies();
        homePage.clickOnContactUSButton();
//        contactUsPage.fillContactUsForm(name, email, mobile, subject, message);
//                contactUsPage.fillContactUsForm("Jhon", "Jhon.com", "0090507090809", "Hello", "Hello All");
        Assert.assertTrue(contactUsPage.getInvalidEmailErrorMessage.getText().contains("Your email and/or password are incorrect"));
    }
}
