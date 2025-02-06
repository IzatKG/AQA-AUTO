
package UI.pages;


import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage {
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id = "doubleClickMessage")
    public WebElement message;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButton;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")//div[@class='mt-4'][2]
    public WebElement sgSaPClickBtn;//id = "SgSaP"

    @FindBy(id = "dynamicClickMessage")
    public WebElement message1;

    @Step("Кликнуть по элементу два раза")
    public ButtonsPage doubleClickButtonElement() {
        actions.doubleClick(doubleClickButton).perform();
        return this;
    }

    @Step("Кликнуть по элементу Right Click Me")
    public ButtonsPage rightClickBtnElement() {
        actions.contextClick(rightClickButton).perform();
        return this;
    }

    @Step("Кликнуть по элементу Click Me")
    public ButtonsPage clickMeButtonElement() {
        elementActions.click(sgSaPClickBtn);
        return this;
    }
}
