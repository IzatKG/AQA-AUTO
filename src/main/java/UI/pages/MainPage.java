package UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//span[test()'Radio Button']")
    public WebElement radioButton;
}
