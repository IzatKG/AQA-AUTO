package UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends BasePage{
    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement elementsButton;


}