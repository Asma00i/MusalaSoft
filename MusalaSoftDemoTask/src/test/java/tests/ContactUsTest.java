package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTest {


    @Test
    public void testFailedContactUs() {

//        contactUs.scrollToFindContactUs();
        homePage.clickOnContactUSButton();
        contactUsPage.fillContactUsForm("Asma", "", "201020280033", "HelloAll", "Hello All");
        Assert.assertTrue(contactUsPage.getInvalidEmailErrorMessage.getText().contains("Your email and/or password are incorrect"));

    }
}
