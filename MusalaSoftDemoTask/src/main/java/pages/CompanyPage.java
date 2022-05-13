package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPage extends PageBase {
    public CompanyPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(className = "cm-content")
    WebElement leadershipHeader;

    @FindBy (className = "musala musala-icon-facebook")
    WebElement fbButton;

    public String getCompanyPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public String getFBPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }


    public void getLeadershipHeaderText() {
        PageBase.getTextFromelement(leadershipHeader);
    }


    public void clickOnFBLink ()
    {
    PageBase.clickButton(fbButton);
    }

}
