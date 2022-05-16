package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CompanyTest extends BaseTest {


    @Test
    public void reachFbProfileFromCompanyTab() {

        homePage.clickAcceptWebCookies();
        homePage.clickOnCompanyTab();
        String companyPageURL = companyPage.getCompanyPageURL();
        Assert.assertTrue(companyPageURL.contains("https://www.musala.com/company/"));
        Assert.assertTrue(companyPage.leadershipHeader.getText().contains("Leadership"));
        companyPage.clickOnFBLink();
        System.out.println("FBButtonPressed");
        String fBPageURL = companyPage.getFBPageURL();
        System.out.println("FBURLGotten");
        Assert.assertEquals(fBPageURL, "https://www.facebook.com/MusalaSoft?fref=ts");


    }
}
