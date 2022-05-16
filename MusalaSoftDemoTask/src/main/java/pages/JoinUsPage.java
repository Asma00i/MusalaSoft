package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class JoinUsPage extends PageBase {


    public JoinUsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"content\"]/section/div[2]/article[2]/div/a/div/div[1]")
    WebElement selectAutomationQAEng;


    public void selectAnywhereLocationFromDropDownList() {
        PageBase.clickDropdown("get_location", "Anywhere");

    }

    public void selectSofiaLocationFromDropDownList() {
        PageBase.clickDropdown("get_location", "Sofia");

    }

    public void selectSkopjeLocationFromDropDownList() {
        PageBase.clickDropdown("get_location", "Skopje");

    }


    public String getJoinUsPageURL() {
        return driver.getCurrentUrl();
    }

    public void selectAutomationQAEng() {
        PageBase.scrollDown(selectAutomationQAEng);
        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/section/div[2]/article[2]/div/a/div/div[1]"))).click();
    }


}
