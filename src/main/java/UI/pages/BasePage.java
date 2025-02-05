package UI.pages;

import UI.driver.Driver;
import UI.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
   public WebElementActions elementActions = new WebElementActions();
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
