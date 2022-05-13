package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyTest extends BaseTest {


    @Test
    public void reachFbProfileFromCompanyTab() {

        homePage.clickOnCompanyTab();
        String companyPageURL = companyPage.getCompanyPageURL();
        Assert.assertEquals(companyPageURL.contains("company"), "Page Loaded Successfully");
        companyPage.getLeadershipHeaderText();
        companyPage.clickOnFBLink();
        String fBPageURL = companyPage.getFBPageURL();
        Assert.assertEquals(fBPageURL.contains("company"), "Page Loaded Successfully");


    }
}
