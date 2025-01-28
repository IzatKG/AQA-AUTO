package UI.helper;

import org.openqa.selenium.WebElement;

public class WebElementActions {

    public WebElementActions click(WebElement element){
        element.click();
        return this;
    }
}