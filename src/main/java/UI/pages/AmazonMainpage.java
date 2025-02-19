package UI.pages;

import UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonMainpage extends BasePage{

    @FindBy(xpath ="(//a[text()='Start here.'])[17]")
    public WebElement signInButton;


    @Step
    public AmazonMainpage clickSignInButton() {
       scrollToBottom(Driver.getDriver());
       signInButton.click();
        return this;
    }
    public static void scrollToBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}
