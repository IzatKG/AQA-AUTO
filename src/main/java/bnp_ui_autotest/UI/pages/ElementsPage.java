package bnp_ui_autotest.UI.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {

    //DRY -don't repeat youself
    @FindBy(xpath = "//span[text()='Buttons']")
    public WebElement buttonsElement;

    @FindBy(xpath = "//span[text()='Text Box']")
    public WebElement textBoxButton;

    @Step("Кликнуть по элементу два раза")
    public ElementsPage clickButtonElement() {
       buttonsElement.click();
        return this;
    }
}
