package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase {

    protected static WebDriver driver; //--> This Needs to be protected

    //Creating Constructor
    protected PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    protected static void clickButton(WebElement button) {

        button.click();

    }

    protected static void getTextFromelement(WebElement gettingTxt) {
        gettingTxt.getText();
    }

    protected static void setElementText(WebElement textelement, String value) {
        textelement.sendKeys(value);
    }

    protected static void scrollDown(By element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
//                ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
    }

    protected static void clickDropdown(String dropdown, String value) {

        Select selectingOptionFromDropDown = new Select(driver.findElement(By.id(dropdown)));
        selectingOptionFromDropDown.selectByValue(value);
    }


    protected static void hoveroverElement(String element, int indexOfSelectedElement) {
        WebElement elementList = driver.findElements(By.cssSelector(element)).get(indexOfSelectedElement - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementList).perform();
    }


    protected static boolean checkElementPresented(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}



