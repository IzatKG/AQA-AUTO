package bnp_ui_autotest.UI.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FillFormPage extends BasePage {
    @FindBy(id = "firstName")
    public WebElement firstNameInputFiled;

    @Step
    public FillFormPage fillRegistrationForm() {
        firstNameInputFiled.sendKeys(faker.name().firstName());
        return this;
    }
}
