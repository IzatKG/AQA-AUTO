package UI.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage{

    @FindBy(xpath = "//span[test()='Buttons']")
    public WebElement buttonsElement;

    @FindBy(id = )

    @Step("Кликнуть по элементу два раза")
    public ElementsPage doubleClick(){
        buttonsElement.click();
        return this;
    }
}
