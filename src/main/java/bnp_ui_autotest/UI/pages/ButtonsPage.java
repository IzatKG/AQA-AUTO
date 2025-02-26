package bnp_ui_autotest.UI.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage {
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id = "doubleClickMessage")
    public WebElement message;

    @FindBy(id = "rightClickBtn")
    public WebElement wrightClickElement;

    @Step("Кликнуть по элементу два раза")
    public ButtonsPage doubleClickButtonElement() {
        actions.doubleClick(doubleClickButton).perform();
        return this;
    }

    @Step("Кликнуть по элементу два раза")
    public ButtonsPage wrightClickButtonElement() {
        actions.moveToElement(wrightClickElement).perform();
        actions.contextClick(wrightClickElement).perform();
        return this;

        // У нас есть 2 интерфейса(A,B) с одиноковыми  дефолтными методами и класс
        // имплементировал эти интерфейсы. Как реализовать метод от интерфейса B
    }
}
