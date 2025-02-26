package bnp_ui_autotest.UI.pages;

import bnp_ui_autotest.UI.driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static bnp_ui_autotest.UI.helper.WebElementActions.scrollToElement;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SliderPage extends BasePage{

    @FindBy(id = "sliderContainer")
    public WebElement sliderElement;

    @Step("")
    public SliderPage moveSlider(){
        scrollToElement(Driver.getDriver(), sliderElement);
        wait.until(ExpectedConditions.visibilityOf(sliderElement));
        actions.clickAndHold(sliderElement).moveByOffset(50,0).release().perform();
       // actions.clickAndHold(sliderElement).moveByOffset(-65,0).release().perform();
      //  int pix = Integer.parseInt(sliderElement.getAttribute("value"));
       // assertTrue(pix > 25 ,"Значение должго увеличиться");
        return this;
    }
}
