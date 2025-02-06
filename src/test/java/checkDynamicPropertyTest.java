import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class checkDynamicPropertyTest extends BaseTest {

    @Test
    @DisplayName("Check the Will enable click")
    public void checkDynamicPropertiesTest() {
        checkboxPage.clickElementsBtn();
        dynamicPropertyPage.dynPropertyButton.click();
        dynamicPropertyPage.clickDynPropertyButton();

        assertTrue(dynamicPropertyPage.enableAfterElement.isEnabled());

    }

    @Test
    @DisplayName("Check the Color Change click")
    public void colorChangeTest() {
        checkboxPage.clickElementsBtn();
        dynamicPropertyPage.dynPropertyButton.click();
        dynamicPropertyPage.clickColorChange();

        assertTrue(dynamicPropertyPage.colorChangeElement.isEnabled());
    }

    @Test
    @DisplayName("Check the Visible After click")
    public void visibleAfterTest() {
        checkboxPage.clickElementsBtn();
        dynamicPropertyPage.dynPropertyButton.click();
        dynamicPropertyPage.clickVisibleAfter();

        assertTrue(dynamicPropertyPage.visibleAfterElement.isEnabled());
    }
}
