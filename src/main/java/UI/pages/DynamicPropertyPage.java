package UI.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicPropertyPage extends BasePage {
    @FindBy(xpath = "//span[text()='Dynamic Properties']")
    public WebElement dynPropertyButton;

    @FindBy(id = "enableAfter")
    public WebElement enableAfterElement;

    @Step
    public DynamicPropertyPage clickDynPropertyButton(){
         wait.until(ExpectedConditions.elementToBeClickable(enableAfterElement));
         return this;
    }
}
