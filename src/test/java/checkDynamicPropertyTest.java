import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class checkDynamicPropertyTest extends BaseTest{

    @Test
    public void checkDynamicPropertiesTest(){
        checkboxPage.clickElementsBtn();
        dynamicPropertyPage.dynPropertyButton.click();
        dynamicPropertyPage.clickDynPropertyButton();

        assertTrue(dynamicPropertyPage.enableAfterElement.isEnabled());

    }
    @Test
    public void checkColorChange(){
        checkboxPage.clickElementsBtn();
       dynamicPropertyPage.dynPropertyButton.click();
        dynamicPropertyPage.colorChangeElement.click();

        assertTrue(dynamicPropertyPage.colorChangeElement.isEnabled());
    }

}