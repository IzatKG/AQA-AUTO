package bnp_ui_autotest.UI.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends BasePage{

    @FindBy(xpath = "//label[@for='yesRadio']")
    public WebElement yesButton;

    @FindBy(xpath = "//span[text()='Yes']")
    public WebElement yesText;

    @Step("Click yes button")
    public RadioButtonPage clickYesBnt(){
        yesButton.click();
        return this;
    }
}
