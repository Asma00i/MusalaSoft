package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Struct;


public class JobsPage extends PageBase {
    public JobsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(className = "wpcf7-form-control wpcf7-submit btn-join-us btn-apply")
    WebElement applyButton;

    @FindBy (id = "cf-1")
    WebElement jobsNameField;

    @FindBy (id = "cf-1")
    WebElement jobsEmailField;

    @FindBy (id = "cf-3")
    WebElement jobsMobileField;

    @FindBy (id = "uploadtextfield")
    WebElement jobsUploadUrCV;

    @FindBy (id = "cf-5")
    WebElement jobsLinkedInProfileLinkField;

    @FindBy (id = "cf-6")
    WebElement jobsYourMessageTxtBox;

    @FindBy (id = "adConsentChx")
    WebElement jobsAgreeCheckBox;

    @FindBy (id = "recaptcha-anchor-label")
    WebElement jobsImNotRobotCheckBox;


    @FindBy (className = "wpcf7-form-control has-spinner wpcf7-submit btn-cf-submit")
    WebElement jobsSendButton;


    public boolean checkGeneralDescriptionSectionReturned() {
        PageBase.checkElementPresented(By.xpath("//h2[text()='General description']"));
        return true;
    }

    public boolean checkRequirementsSectionReturned() {
        PageBase.checkElementPresented(By.xpath("//h2[text()='Requirements']"));
        return true;
    }

    public boolean checkResponsibilitiesSectionReturned() {
        PageBase.checkElementPresented(By.xpath("//h2[text()='Responsibilities']"));
        return true;

    }

    public boolean checkWhatWeOfferSectionReturned() {
        PageBase.checkElementPresented(By.xpath("//h2[text()='What we offer']"));
        return true;
    }

    public boolean checkApplyButtonReturned() {
        PageBase.checkElementPresented(By.className("wpcf7-form-control wpcf7-submit btn-join-us btn-apply"));
        return true;
    }

    public void clickOnApplyButton()
    {
        PageBase.clickButton(applyButton);
    }


    public void fillContactUsForm(String name, String email, String mobile, String subject, String massage) {

        PageBase.setElementText(jobsNameField, name);
        PageBase.setElementText(jobsEmailField, email);
        PageBase.setElementText(jobsMobileField, mobile);
        PageBase.setElementText(contactUsSubjectField, subject);
        PageBase.setElementText(contactUsMessageField, massage);
        PageBase.clickButton(imNotRobotCheckBox);
        PageBase.clickButton(jobsSendButton);
    }
}
