package UI.pages;

import UI.driver.Driver;
import UI.helper.WebElementActions;
import io.qameta.allure.Step;
import org.apache.hc.core5.http.nio.entity.BasicAsyncEntityConsumer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {

    //DRY -don't repeat youself
    @FindBy(xpath = "//span[text()='Buttons']")
    public WebElement buttonsElement;

    @FindBy(xpath = "//span[text()='Text Box']")
    public WebElement textBoxButton;

    @Step("Кликнуть по элементу два раза")
    public ElementsPage clickButtonElement() {
        WebElementActions.scrollToElement(Driver.getDriver(),buttonsElement);
        buttonsElement.click();
        return this;
    }
}