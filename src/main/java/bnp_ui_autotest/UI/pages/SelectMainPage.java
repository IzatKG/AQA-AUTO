package bnp_ui_autotest.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelectMainPage extends BasePage{

    @FindBy(id = "oldSelectMenu")
    public WebElement oldSelectElement;

    public SelectMainPage selectElementByText(String text) {
        Select select = new Select(oldSelectElement);
        select.selectByVisibleText(text);
        return this;
    }
}
