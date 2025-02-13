package UI.pages;

import UI.entities.UserData;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage{

    @FindBy(xpath = "//input[@placeholder='Full Name']")
    public WebElement fullNameInputField;

    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    public WebElement emailInputField;

    @FindBy(xpath = "//input[@placeholder='Current Address']")
    public WebElement currentAddressInputField;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    public WebElement permanentAddressInputField;

    UserData userData = UserData.builder()
            .fullName("IZat")
            .email("mn@gmail.com")
            .currentAddress("www street 15")
            .permanentAddress("kkk 14")
            .build();

    @Step("Fill registration form for a new user")
    public TextBoxPage  fillRegistrationForm(){
        fullNameInputField.sendKeys(userData.getFullName());
        emailInputField.sendKeys(userData.getEmail());
        currentAddressInputField.sendKeys(userData.getCurrentAddress());
        permanentAddressInputField.sendKeys(userData.getPermanentAddress());
        return this;
    }
}

