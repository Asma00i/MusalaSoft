package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[text()='Contact us']")
    WebElement homepageContactUS;

    //    @FindBy (css = "a[href*='https://www.musala.com/company/']")
//    @FindBy(className = "main-link")
//    WebElement homepageCompanyTab;

    @FindBy(css = "a[href*='https://www.musala.com/careers/']")
    WebElement homepageCareersTab;


    public void clickOnContactUSButton() {

        PageBase.scrollDown((By) homepageContactUS);
        PageBase.clickButton(homepageContactUS);
    }

    public void clickOnCompanyTab() {

        PageBase.hoveroverElement("a[href*='https://www.musala.com/company/']", 1);
//        PageBase.clickButton(homepageCompanyTab);
    }

    public void clickOnCareersTab() {
        PageBase.clickButton(homepageCareersTab);
    }


}
