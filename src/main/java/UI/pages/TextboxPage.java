package UI.pages;

import UI.driver.Driver;
import UI.entities.UserData;
import UI.helper.WebElementActions;
import UI.utils.DataProvider;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TextboxPage extends BasePage {
    @FindBy(xpath = "//input[@placeholder='Full Name']")
    public WebElement fullNameInputField;
    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    public WebElement emailInputField;
    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    public WebElement currentAddressInputField;
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    public WebElement permanentAddressInputField;

    @FindBy(xpath = "//button[contains(@class, 'btn-primary')]")
    public WebElement submitButton;
    @FindBy(className = "mb-1")
    public List<WebElement> textAfterSubmit;

    @Step("Fill registration form for a new user")
    public TextboxPage fillRegistrationForm(UserData userData) {
        fullNameInputField.sendKeys(userData.getFullName());
        emailInputField.sendKeys(userData.getEmail());
        currentAddressInputField.sendKeys(userData.getCurrentAddress());
        permanentAddressInputField.sendKeys(userData.getPermanentAddress());
        wait.until(ExpectedConditions.visibilityOf(submitButton));
        WebElementActions.scrollToElement(Driver.getDriver(),submitButton);
        submitButton.click();
        return this;
    }

    @Step
    public TextboxPage fillForm(){
        UserData user = DataProvider.getUser();
        fillRegistrationForm(user);
        return this;
    }

}
