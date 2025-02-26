package bnp_ui_autotest.UI.pages;

import bnp_ui_autotest.UI.driver.Driver;
import bnp_ui_autotest.UI.helper.WebElementActions;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
   public WebElementActions elementActions = new WebElementActions();
    public Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    public Faker faker = new Faker();
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
