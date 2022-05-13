package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinUsTest extends BaseTest {


    @Test
    public void testFailedApplyingToQAPosition() {
        homePage.clickOnCareersTab();
        careersPage.checkOurOpenPositions();
        String URL = joinUsPage.getJoinUsPageURL();
        Assert.assertEquals(URL.contains("join-us"), "Page Loaded Successfully");
        joinUsPage.selectLocationFromDropDownList();
        joinUsPage.selectAutomationQAEng();
        Assert.assertEquals(true, jobsPage.checkGeneralDescriptionSectionReturned());
        Assert.assertEquals(true, jobsPage.checkRequirementsSectionReturned());
        Assert.assertEquals(true, jobsPage.checkResponsibilitiesSectionReturned());
        Assert.assertEquals(true, jobsPage.checkWhatWeOfferSectionReturned());
        Assert.assertEquals(true, jobsPage.checkApplyButtonReturned());

    }
}
