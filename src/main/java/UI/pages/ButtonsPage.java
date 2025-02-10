package UI.pages;

import UI.driver.Driver;
import UI.helper.WebElementActions;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ButtonsPage extends BasePage{
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement clickButton;

    @FindBy(id ="doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy(id ="dynamicClickMessage")
    public WebElement clickMessage;


    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButton;

    @FindBy(id ="rightClickMessage")
    public WebElement rightClickMessage;

    @Step("Кликнуть по элементу два раза")
    public ButtonsPage doubleClickButtonElement() {
        actions.doubleClick(doubleClickButton).perform();
        return this;
    }

    @Step("Кликнуть по элементу через правую клавишу мышки")
    public ButtonsPage rightClickButtonElement() {
        wait.until(ExpectedConditions.elementToBeClickable(rightClickButton));
        WebElementActions.scrollToElement(Driver.getDriver(), rightClickButton);
        actions.contextClick(rightClickButton).perform();
        return this;
    }
    @Step("Кликнуть по элементу")
    public ButtonsPage clickButtonElement() {
        wait.until(ExpectedConditions.elementToBeClickable(clickButton));
        WebElementActions.scrollToElement(Driver.getDriver(), clickButton);
        actions.click(clickButton).perform();
        return this;
    }


}