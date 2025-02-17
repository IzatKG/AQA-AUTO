package UI.pages;

import UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static UI.helper.WebElementActions.scrollToElement;

public class AlertsPage extends BasePage{
    @FindBy(id="alertButton")
    public WebElement clickMeButton;

    @Step("Клмакаем по кнопке 'ClickMe button'")
    public AlertsPage clickMeButton(){
        scrollToElement(Driver.getDriver(), clickMeButton);
        clickMeButton.click();
        return this;
    }
}
