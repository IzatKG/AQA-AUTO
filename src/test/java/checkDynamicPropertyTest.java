import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class checkDynamicPropertyTest extends BaseTest{

    @Test
    public void checkDynamicPropertiesTest(){
        checkboxPage.clickElementsBtn();
        dynamicPropertyPage.clickDynPropertyButton();

        assertTrue(dynamicPropertyPage.dynPropertyButton.isEnabled());
        assertTrue(dynamicPropertyPage.enableAfterElement.isEnabled());

    }
}
