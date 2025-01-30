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

    @FindBy(xpath = "//label[@for='tree-node-desktop']")
    public WebElement desktop;

    @FindBy(xpath = "//button[@aria-label='Expand all']")
    public WebElement expand;

    @FindBy(xpath = "//label[@for='tree-node-commands']")//input[@id='tree-node-commands']
    public WebElement nodeCommands;//label[@for='tree-node-commands']

    @FindBy(xpath = "//label[@for='tree-node-react']")
    public WebElement nodeReact;

    @FindBy(xpath = "//label[@for='tree-node-private']")
    public WebElement nodePrivate;

    @FindBy(xpath = "//label[@for='tree-node-downloads']")
    public WebElement nodeDownloads;

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
        elementActions.click(desktop);
        elementActions.click(expand);
        return this;
    }

    @Step("Click private")
    public CheckboxPage clickCheckboxBtnAndPath() {
        elementActions.click(nodeCommands);
        elementActions.click(nodeReact);
        elementActions.click(nodePrivate);
        elementActions.click(nodeDownloads);
        return this;
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

