package UI.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelectMainPage extends BasePage {
    @FindBy(id ="oldSelectMenu")
    public WebElement oldSelectElement;

    @FindBy(id = "alert2")
    public WebElement button2;

    public SelectMainPage selectElementByText(String text){
        Select select = new Select(oldSelectElement);
        //select.deselectByVisibleText(text);
        select.selectByIndex(4);
        return this;
    }
}
