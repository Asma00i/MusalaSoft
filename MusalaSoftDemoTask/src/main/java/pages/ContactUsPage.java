package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "cf-1")
    WebElement contactUsNameField;

    @FindBy(id = "cf-2")
    WebElement contactUsEmailField;

    @FindBy(id = "cf-3")
    WebElement contactUsMobileField;

    @FindBy(id = "cf-4")
    WebElement contactUsSubjectField;

    @FindBy(id = "cf-5")
    WebElement contactUsMessageField;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-checkmark']")
    WebElement imNotRobotCheckBox;

    @FindBy(xpath = "//input[@class='wpcf7-form-control has-spinner wpcf7-submit btn-cf-submit']")
    WebElement sendContactUsForm;

    @FindBy(xpath = "//span[@class='wpcf7-not-valid-tip']")
    public WebElement getInvalidEmailErrorMessage;


    public void fillContactUsForm(String name, String email, String mobile, String subject, String massage) {

        PageBase.setElementText(contactUsNameField, name);
        PageBase.setElementText(contactUsEmailField, email);
        PageBase.setElementText(contactUsMobileField, mobile);
        PageBase.setElementText(contactUsSubjectField, subject);
        PageBase.setElementText(contactUsMessageField, massage);
        PageBase.clickButton(imNotRobotCheckBox);
        PageBase.clickButton(sendContactUsForm);
    }


}



