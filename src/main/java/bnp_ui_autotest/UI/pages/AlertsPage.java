package bnp_ui_autotest.UI.pages;

import bnp_ui_autotest.UI.driver.Driver;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static bnp_ui_autotest.UI.helper.WebElementActions.scrollToElement;
@Feature("ALERTS")
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
