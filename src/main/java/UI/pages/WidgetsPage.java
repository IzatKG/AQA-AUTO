package UI.pages;

import UI.driver.Driver;
import UI.helper.WebElementActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static UI.helper.WebElementActions.scrollToElement;

public class WidgetsPage extends BasePage {
    @FindBy(xpath = "(//div[@class='card-body'])[4]")
    public WebElement widgetsElement;
    @FindBy(xpath = "//span[text()='Select Menu']")
    public WebElement selectMenuBtn;
    @FindBy(xpath = "(//div[@class=' css-1wa3eu0-placeholder'][1])")
    public WebElement selectOptionBtn;
    @FindBy(xpath = "//select[@id='oldSelectMenu']")
    public WebElement oldStyleSelectMenuBtn;
    @FindBy(id = "cars")
    public WebElement standardMultiSelectBtn;


    public WidgetsPage selectDropDownByIndex(int index) {
        Select select = new Select(oldStyleSelectMenuBtn);
        select.selectByIndex(index);
        return this;
    }
    public WidgetsPage selectDropDownByText(String text){
        WebElementActions.scrollToElement(Driver.getDriver(),standardMultiSelectBtn);
        Select select = new Select(standardMultiSelectBtn);
        select.selectByVisibleText(text);
        //assertTrue(select.getAllSelectedOptions().size() ==3);

        return this;
    }
    public WidgetsPage selectDropDownByGetOption(){
        Select select = new Select(selectOptionBtn);
        select.getAllSelectedOptions();
        return this;
    }

}
