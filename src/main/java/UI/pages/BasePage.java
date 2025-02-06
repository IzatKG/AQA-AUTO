package UI.pages;

import UI.driver.Driver;
import UI.helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    public WebElementActions elementActions = new WebElementActions();
    public Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}