package bnp_ui_autotest.UI.pages;

import bnp_ui_autotest.UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static bnp_ui_autotest.UI.helper.WebElementActions.scrollToElement;

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
