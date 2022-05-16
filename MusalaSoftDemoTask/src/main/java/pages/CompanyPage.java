package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class CompanyPage extends PageBase {
    public CompanyPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//*[text()='Leadership']")
    public WebElement leadershipHeader;

    @FindBy(css = "span.musala.musala-icon-facebook")
    WebElement fbButton;

    public String getCompanyPageURL() {
        return driver.getCurrentUrl();
    }

    public String getFBPageURL() {
        return driver.getCurrentUrl();
    }


    public void clickOnFBLink() {
        PageBase.implicitWait();
        PageBase.scrollDown(fbButton);
        PageBase.clickButton(fbButton);
        PageBase.implicitWait();
    }

}
