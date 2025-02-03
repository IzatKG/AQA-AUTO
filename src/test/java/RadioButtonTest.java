import UI.owner.Owner;
import UI.owner.Owners;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Owner(Owners.TOBOKELOV_JOLDOSH)
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

    @Test
    @DisplayName("Check radio button Impressive")
    public void checkImpressiveButtonTest() {
        checkboxPage.clickElementsBtn();
        mainPage.radioButton.click();
        radioButtonPage.impressiveButton.click();

        assertTrue(radioButtonPage.impressiveButton.isEnabled());
    }
}
