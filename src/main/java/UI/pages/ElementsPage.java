package UI.pages;

import UI.driver.Driver;
import io.qameta.allure.Step;
import org.apache.hc.core5.http.nio.entity.BasicAsyncEntityConsumer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static UI.helper.WebElementActions.scrollToElement;

public class ElementsPage extends BasePage {

    //DRY -don't repeat youself
    @FindBy(xpath = "//span[text()='Buttons']")
    public WebElement buttonsElement;

    @FindBy(xpath = "//span[text()='Text Box']")
    public WebElement textBoxButton;

    @FindBy(xpath = "//span[text()='Browser Windows']")
    public WebElement browserWindows;

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertsElement;

    @Step("Кликнуть по элементу два раза")
    public ElementsPage clickAlertElement() {
        scrollToElement(Driver.getDriver(),alertsElement);
       alertsElement.click();
        return this;
    }
}
