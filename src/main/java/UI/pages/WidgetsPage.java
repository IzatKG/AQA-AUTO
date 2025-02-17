package UI.pages;

import UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static UI.helper.WebElementActions.scrollToElement;

public class WidgetsPage extends BasePage {
    @FindBy(xpath = "//span[text()='Select Menu']")
    public WebElement selectMenuButton;


    @Step("Клик по элементу selcetMenu")
    public WidgetsPage clickMenuSelect() {
        scrollToElement(Driver.getDriver(), selectMenuButton);
        selectMenuButton.click();
        return this;
    }
}
