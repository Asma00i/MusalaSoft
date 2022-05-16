package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[text()='Contact us']")
    WebElement homepageContactUS;




    public void clickAcceptWebCookies() {

        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(ExpectedConditions.elementToBeClickable(By.id("wt-cli-accept-all-btn"))).click();

    }

    public void clickOnContactUSButton() {

        PageBase.scrollDown(homepageContactUS);
        PageBase.clickButton(homepageContactUS);
    }


    public void clickOnCompanyTab() {

        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id=\"menu-main-nav-1\"]//li/a[text()='Company']"))).click();

    }

    public void clickOnCareersTab() {

        new WebDriverWait(driver, Duration.ofSeconds(1L)).until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id=\"menu-main-nav-1\"]//li/a[text()='Careers']"))).click();


    }


}
