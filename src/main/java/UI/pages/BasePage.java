package UI.pages;

import UI.driver.Driver;
import UI.helper.WebElementActions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
   public WebElementActions elementActions = new WebElementActions();
    public Actions actions = new Actions(Driver.getDriver());

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
