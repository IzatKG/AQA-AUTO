package UI.pages;

import UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static UI.helper.WebElementActions.scrollToElement;

public class BrowserWindowsPage extends BasePage {
    @FindBy(id = "tabButton")
    public WebElement tabButton;

    @FindBy(id = "windowButton")
    public WebElement windowBtn;

    @FindBy(id = "messageWindowButton")
    public WebElement windowMessage;

    @Step
    public BrowserWindowsPage newWindow(){
        scrollToElement(Driver.getDriver(),windowBtn);
        windowBtn.click();
        return this;
    }


}