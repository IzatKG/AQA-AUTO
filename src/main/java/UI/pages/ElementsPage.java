package UI.pages;

import UI.driver.Driver;
import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {

    //DRY -don't repeat youself
    @FindBy(xpath = "//span[text()='Buttons']")
    public WebElement buttonsElement;

    @Step("Кликнуть по элементу два раза")
    public ElementsPage clickButtonElement() {
       buttonsElement.click();
        return this;
    }
}
