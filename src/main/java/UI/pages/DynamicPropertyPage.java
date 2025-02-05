package UI.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicPropertyPage extends BasePage{

    @FindBy(xpath = "")
    public WebElement dynPropertyButton;

    @FindBy(id = "")
    public WebElement enableAfterElement;

    @Step
    public DynamicPropertyPage clickDynPropertyButton(){
        wait.until(ExpectedConditions.elementToBeClickable(enableAfterElement));
        return this;
    }
}
