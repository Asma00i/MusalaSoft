package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class JobsPage extends PageBase {
    public JobsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h2[text()='General description']")
    WebElement generalDescriptionSection;

    @FindBy(xpath = "//h2[text()='Requirements']")
    WebElement requirementsSection;

    @FindBy(xpath = "//h2[text()='Responsibilities']")
    WebElement responsibilitiesSection;

    @FindBy(xpath = "//h2[text()='What we offer']")
    WebElement whatWeOfferSection;

    @FindBy(xpath = "//input[@value='Apply']")
    WebElement applyButton;

    @FindBy(id = "cf-1")
    WebElement jobsNameField;

    @FindBy(id = "cf-1")
    public WebElement jobsEmailField;

    @FindBy(id = "cf-3")
    WebElement jobsMobileField;

    @FindBy(id = "cf-5")
    WebElement jobsLinkedInProfileLinkField;

    @FindBy(id = "cf-6")
    WebElement jobsYourMessageTxtBox;

    @FindBy(id = "adConsentChx")
    WebElement jobsAgreeCheckBox;

    @FindBy(css = "div.recaptcha-accessible-status")
    WebElement jobsImNotRobotCheckBox;

    @FindBy(xpath = "//*[@id=\"wpcf7-f880-o1\"]/form/span/span/div/div/iframe")
    WebElement imNotRobotIfram;


    @FindBy(xpath = "//input[@value='Send']")
    WebElement jobsSendButton;

    @FindBy(className = "close-form")
    WebElement pressCloseForInvalidInputScreen;


    public boolean checkGeneralDescriptionSectionReturned() {
        PageBase.checkElementPresented((By.xpath("//h2[text()='General description']")));
        return true;
    }

    public boolean checkRequirementsSectionReturned() {
        PageBase.checkElementPresented((By.xpath("//h2[text()='Requirements']")));
        return true;
    }

    public boolean checkResponsibilitiesSectionReturned() {
        PageBase.checkElementPresented((By.xpath("//h2[text()='Responsibilities']")));
        return true;

    }

    public boolean checkWhatWeOfferSectionReturned() {
        PageBase.checkElementPresented(By.xpath("//h2[text()='What we offer']"));
        return true;
    }

    public boolean checkApplyButtonReturned() {
        PageBase.checkElementPresented(By.xpath("//input[@value='Apply']"));
        return true;
    }

    public void clickOnApplyButton() {
        PageBase.clickButton(applyButton);
    }


    public void clickOnImNotRobot() {

        driver.switchTo().frame(imNotRobotIfram);
        WebElement imNotRobot = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor-label\"]"));
        imNotRobot.click();

    }


    public void fillApplyForForm(String name, String email, String mobile, String linkedinProfileLink, String massage) {

        PageBase.setElementText(jobsNameField, name);
        PageBase.setElementText(jobsEmailField, email);
        PageBase.setElementText(jobsMobileField, mobile);
        PageBase.uploadFile(By.id("uploadtextfield"), "src/main/config/config.properties");
        PageBase.setElementText(jobsLinkedInProfileLinkField, linkedinProfileLink);
        PageBase.setElementText(jobsYourMessageTxtBox, massage);
        PageBase.clickButton(jobsAgreeCheckBox);
        clickOnImNotRobot();
        PageBase.clickButton(jobsSendButton);
    }

    public void pressCloseForInvalidInputScreen() {
        PageBase.clickButton(pressCloseForInvalidInputScreen);
    }
}
