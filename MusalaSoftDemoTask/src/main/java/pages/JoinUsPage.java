package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class JoinUsPage extends PageBase {


    public JoinUsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "img[src='https://www.musala.com/wp-content/uploads/2018/10/Capture-2.png']")
    WebElement selectAutomationQAEng;


    public void selectLocationFromDropDownList() {
        PageBase.clickDropdown("get_location", "Anywhere");

    }

    public String getJoinUsPageURL() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public void selectAutomationQAEng() {
        PageBase.clickButton(selectAutomationQAEng);
    }


}
