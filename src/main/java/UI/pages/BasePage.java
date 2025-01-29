package UI.pages;

import UI.driver.Driver;
import UI.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
     public WebElementActions elementActions;
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
