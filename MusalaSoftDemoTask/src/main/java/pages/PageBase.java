package pages;


import org.openqa.selenium.*;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class PageBase {

    protected static WebDriver driver;

    //Creating Constructor
    protected PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected static void clickButton(WebElement button) {

        button.click();

    }

    protected static String getElementText(WebElement gettingTxt) {
        String getTxt = gettingTxt.getText();
        return getTxt;
    }

    protected static void setElementText(WebElement textelement, String value) {
        textelement.sendKeys(value);
    }

    protected static void scrollDown(WebElement element) {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    protected static void clickDropdown(String dropdown, String value) {

        Select selectingOptionFromDropDown = new Select(driver.findElement(By.id(dropdown)));
        selectingOptionFromDropDown.selectByValue(value);
    }


    protected static boolean checkElementPresented(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected static void uploadFile(By by, String filePath) {
        driver.findElement(by).sendKeys(filePath);
    }


    protected static void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));

    }
}

