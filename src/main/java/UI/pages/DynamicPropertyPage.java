package UI.pages;

import UI.driver.Driver;
import UI.helper.WebElementActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicPropertyPage extends BasePage{
    @FindBy(xpath = "//span[text()='Dynamic Properties']")
    public WebElement dynPropertyButton;

    @FindBy(id = "enableAfter")
    public WebElement enableAfterElement;

    @FindBy(id = "visibleAfter")
    public WebElement visibleAfterElement;

    @FindBy(id = "colorChange")
    public WebElement colorChangElement;


    @Step
     public DynamicPropertyPage clickDynPropertyButton(){
     wait.until(ExpectedConditions.elementToBeClickable(enableAfterElement));
     return this;
    }
    @Step
     public DynamicPropertyPage textColorChange(String initialColor){
        WebElementActions.scrollToElement(Driver.getDriver(), colorChangElement);
        wait.until(ExpectedConditions.not(
                ExpectedConditions.attributeToBe(colorChangElement, "color", initialColor)
        ));     return this;
    }

    @Step
     public DynamicPropertyPage visibleAfter(){
        WebElementActions.scrollToElement(Driver.getDriver(), visibleAfterElement);
        wait.until(ExpectedConditions.visibilityOf(visibleAfterElement));
        return this;
    }

}
