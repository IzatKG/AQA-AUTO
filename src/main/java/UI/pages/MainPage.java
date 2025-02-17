package UI.pages;

import UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static UI.helper.WebElementActions.scrollToElement;

public class MainPage extends BasePage {

    @FindBy(xpath = "//span[text()='Radio Button']")
    public WebElement radioButton;

    @FindBy(xpath = "//h5[text()='Widgets']")
    public WebElement widgetsBtn;

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    public WebElement alertFrameWindow;

    @Step("Клик по кнопке виджет")
    public MainPage clickWidgetButton() {
        scrollToElement(Driver.getDriver(), widgetsBtn);
        widgetsBtn.click();
        return this;
    }

    @Step
    public MainPage clickElemenrAlert() {
        scrollToElement(Driver.getDriver(), alertFrameWindow);
        alertFrameWindow.click();
        return this;
    }
}