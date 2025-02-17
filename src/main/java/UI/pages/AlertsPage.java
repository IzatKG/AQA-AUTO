package UI.pages;

import UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static UI.helper.WebElementActions.scrollToElement;

public class AlertsPage extends BasePage{
    @FindBy (id ="alertButton")
    public WebElement clickMeButton;

    @FindBy (id = "timerAlertButton")
    public WebElement timerClickMe;


    @FindBy (id = "confirmButton")
    public WebElement confirmButton;

    @FindBy (id = "promtButton")
    public WebElement promtButton;

    @Step (" Кликаем по кнопке")
    public AlertsPage clickMeButton(){
        scrollToElement(Driver.getDriver(),clickMeButton);
        clickMeButton.click();
        return this;
    }
    @Step ("Кликаем по кнопке 2 с таимером ClickMe")
    public AlertsPage timerClickMeButton(){
        scrollToElement(Driver.getDriver(),timerClickMe);
        timerClickMe.click();
        return this;
    }
    @Step ("Кликаем по 3 кнопке ClickMe")
    public AlertsPage popClickMeButton(){
        scrollToElement(Driver.getDriver(),confirmButton);
        confirmButton.click();
        return this;
    }
    @Step ("Кликаем по  четвертой ClickMe")
    public AlertsPage promtMeButton(){
        scrollToElement(Driver.getDriver(),promtButton);
        promtButton.click();
        return this;
    }


}
