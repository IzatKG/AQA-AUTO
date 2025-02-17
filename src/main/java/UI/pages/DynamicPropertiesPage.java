package UI.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicPropertiesPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "enableAfter")
    private WebElement enableButton;

    @FindBy(id = "visibleAfter")
    private WebElement visibleButton;

    @FindBy(id = "colorChange")
    private WebElement colorChangeButton;

    public DynamicPropertiesPage() {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public boolean isEnableButtonEnabled() {
        wait.until(ExpectedConditions.elementToBeClickable(enableButton));
        return enableButton.isEnabled();
    }

    public boolean isVisibleButtonDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(visibleButton));
        return visibleButton.isDisplayed();
    }

    public String getColorChangeButtonColor() {
        return colorChangeButton.getCssValue("color");
    }
}
