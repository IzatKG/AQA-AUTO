package bnp_ui_autotest.UI.pages;

import bnp_ui_autotest.UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static bnp_ui_autotest.UI.helper.WebElementActions.scrollToElement;

public class DropablePage extends BasePage {

    @FindBy(xpath = "//div[text()='Drag me']")
    public WebElement dragElement;

    @FindBy(xpath = "(//p[text()='Drop here'])[1]")
    public WebElement dropHereElement;


    @FindBy(xpath = "//p[text()='Dropped!']")
    public WebElement droppedText;
    @Step("")
    public DropablePage dragElement() {
        scrollToElement(Driver.getDriver(), dragElement);
        wait.until(ExpectedConditions.visibilityOf(dragElement));
        wait.until(ExpectedConditions.visibilityOf(dropHereElement));
        actions.dragAndDrop(dragElement, dropHereElement).perform();
        return this;
    }

    @Step("Drag element ")
    public DropablePage dragElementTo(){
        scrollToElement(Driver.getDriver(), dragElement);
        wait.until(ExpectedConditions.visibilityOf(dragElement));
        actions.dragAndDropBy(dragElement,200,10).perform();
        return this;
    }
}
