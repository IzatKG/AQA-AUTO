package UI.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage {

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id = "doubleClickMessage")
    public WebElement message;

    @Step("Кликнуть по элементу два раза")
    public ButtonsPage doubleClickButtonElement() {
        return this;
    }
}
