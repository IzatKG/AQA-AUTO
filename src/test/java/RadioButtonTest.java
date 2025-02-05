import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RadioButtonTest extends BaseTest {

    @Test
    @DisplayName("Check radio button")
    public void checkRadioBtnTest() {
        checkboxPage.clickElementsBtn();
        mainPage.radioButton.click();
        radioButtonPage.clickYesBnt();

        String text = radioButtonPage.yesText.getText();

        assertTrue(radioButtonPage.yesButton.isEnabled());
        assertEquals("Yes", text);

    }
}
