package UI.pages;

import UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends BasePage {
    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement elementsButton;

    @FindBy(xpath = "//span[text()='Check Box']")
    public WebElement checkboxButton;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement toggler;

    @Step
    public CheckboxPage clickElementsBtn() {
        scrollToElement(Driver.getDriver(), elementsButton);
        elementsButton.click();
        return this;
    }

    @Step
    public CheckboxPage clickCheckboxBtnAndToggler() {
        elementActions.click(checkboxButton);
        elementActions.click(toggler);
        return this;
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
