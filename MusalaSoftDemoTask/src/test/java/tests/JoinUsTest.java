package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinUsTest extends BaseTest {


    @Test
    public void testFailedApplyingToQAPosition() {
        homePage.clickAcceptWebCookies();
        homePage.clickOnCareersTab();
        careersPage.checkOurOpenPositions();
        String URL = joinUsPage.getJoinUsPageURL();
        Assert.assertTrue(URL.contains("join-us"), "Page Loaded Successfully");
        joinUsPage.selectAnywhereLocationFromDropDownList();
        joinUsPage.selectAutomationQAEng();
        Assert.assertEquals(true, jobsPage.checkGeneralDescriptionSectionReturned());
        Assert.assertEquals(true, jobsPage.checkRequirementsSectionReturned());
        Assert.assertEquals(true, jobsPage.checkResponsibilitiesSectionReturned());
        Assert.assertEquals(true, jobsPage.checkWhatWeOfferSectionReturned());
        Assert.assertEquals(true, jobsPage.checkApplyButtonReturned());

        jobsPage.clickOnApplyButton();
        jobsPage.fillApplyForForm("Jhon", "Jhon.com", "0090507090809", "www.linkedin.com", "Applying For New Job");

        jobsPage.clickOnApplyButton();

        Assert.assertTrue(jobsPage.jobsEmailField.getText().contains("The e-mail address entered is invalid"));

        jobsPage.pressCloseForInvalidInputScreen();
    }

    @Test

    public void testPrintOpenPositionsBySofia() throws InterruptedException {
        homePage.clickAcceptWebCookies();
        homePage.clickOnCareersTab();
        careersPage.checkOurOpenPositions();
        joinUsPage.selectSofiaLocationFromDropDownList();
        joinUsPage.selectAutomationQAEng();

    }

    @Test
    public void testPrintOpenPositionsBySkopje() throws InterruptedException {
        homePage.clickAcceptWebCookies();
        homePage.clickOnCareersTab();
        careersPage.checkOurOpenPositions();
        joinUsPage.selectSkopjeLocationFromDropDownList();
        joinUsPage.selectAutomationQAEng();

    }

}

