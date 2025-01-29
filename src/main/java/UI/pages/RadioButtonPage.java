package UI.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage {

    @FindBy(xpath = "//ladel[@for='yesRadio']")
    public WebElement yesButton;

    @FindBy(xpath = "//span[test()='Yes']")
    public WebElement yesTest;

    @Step("Click yes button")
    public RadioButtonPage clickYesBtn(){
        yesButton.click();
        return this;
    }
}
