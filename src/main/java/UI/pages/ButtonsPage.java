package UI.pages;

import UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage{
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id ="doubleClickMessage")
    public WebElement message;

    @Step("Кликнуть по элементу два раза")
    public ButtonsPage doubleClickButtonElement() {
        actions.doubleClick(doubleClickButton).perform();
        return this;
    }
}
