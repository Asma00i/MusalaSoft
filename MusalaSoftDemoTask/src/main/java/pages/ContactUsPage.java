package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(xpath = "//*[@id=\"wpcf7-f875-o1\"]/form/span/span/div/div/iframe")
    WebElement imNotRobotIfram;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement sendContactUsForm;

    @FindBy(xpath = "//span[@class='wpcf7-not-valid-tip']")
    public WebElement getInvalidEmailErrorMessage;


    public void fillContactUsForm(String name, String email, String mobile, String subject, String massage) {

        PageBase.setElementText(contactUsNameField, name);
        PageBase.setElementText(contactUsEmailField, email);
        PageBase.setElementText(contactUsMobileField, mobile);
        PageBase.setElementText(contactUsSubjectField, subject);
        PageBase.setElementText(contactUsMessageField, massage);
        clickOnImNotRobot();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        PageBase.implicitWait();

        PageBase.clickButton(sendContactUsForm);
    }

    public void clickOnImNotRobot() {

        driver.switchTo().frame(imNotRobotIfram);
        WebElement imNotRobot = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor-label\"]"));
        imNotRobot.click();

    }

}



