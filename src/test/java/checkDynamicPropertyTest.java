import UI.driver.Driver;
import UI.helper.WebElementActions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class checkDynamicPropertyTest extends BaseTest{

    @Test
    public void checkDynamicPropertiesTest(){
        checkboxPage.clickElementsBtn();
        dynamicPropertyPage.dynPropertyButton.click();
        dynamicPropertyPage.clickDynPropertyButton();

        assertTrue(dynamicPropertyPage.enableAfterElement.isEnabled());

    }

    @Test
    public void checkVisiblityOfElement(){
        checkboxPage.clickElementsBtn();
        WebElementActions.scrollToElement(Driver.getDriver(), dynamicPropertyPage.dynPropertyButton);
        dynamicPropertyPage.dynPropertyButton.click();
        dynamicPropertyPage.visibleAfter();

        assertTrue(dynamicPropertyPage.visibleAfterElement.isDisplayed());

    }
    @Test
    public void checkColorChangeTest(){
        checkboxPage.clickElementsBtn();
        WebElementActions.scrollToElement(Driver.getDriver(), dynamicPropertyPage.dynPropertyButton);

        dynamicPropertyPage.dynPropertyButton.click();
        String initialColor = dynamicPropertyPage.colorChangElement.getCssValue("color");

        dynamicPropertyPage.textColorChange(initialColor);
        assertEquals(initialColor, dynamicPropertyPage.colorChangElement.getCssValue("color"));

    }

}
