
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

    @FindBy(id = "colorChange")
    public WebElement colorChangeElement;

    @FindBy(id = "visibleAfter")
    public WebElement visibleAfterElement;

    @Step
    public DynamicPropertyPage clickDynPropertyButton() {
        wait.until(ExpectedConditions.elementToBeClickable(enableAfterElement));
        return this;
    }

    @Step
    public DynamicPropertyPage clickColorChange() {
        // wait.until(ExpectedConditions.elementToBeClickable(colorChangeElement));
        actions.click(colorChangeElement).perform();
        return this;
    }

    @Step
    public DynamicPropertyPage clickVisibleAfter() {
        wait.until(ExpectedConditions.elementToBeClickable(visibleAfterElement));
        return this;
    }
}
