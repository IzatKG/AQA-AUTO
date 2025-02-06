import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckDoubleClickButtonTest extends BaseTest {

    public static final String ERROR_MESSAGE = "You have done a double click";

    @Test
    @DisplayName("Check the double click")
    public void checkDoubleClick() {
        checkboxPage.clickElementsBtn();
        elementsPage.clickButtonElement();
        buttonsPage.doubleClickButtonElement();

        assertTrue(buttonsPage.message.isDisplayed());
        assertEquals(ERROR_MESSAGE, buttonsPage.message.getText());

    }

    @Test
    @DisplayName("Check the right click")
    public void checkRightClickBtn() {
        checkboxPage.clickElementsBtn();
        elementsPage.clickButtonElement();
        buttonsPage.rightClickBtnElement();

    }

    @Test
    @DisplayName("Check the Click Me click")
    public void checkClickMeBtn() {
        checkboxPage.clickElementsBtn();
        elementsPage.clickButtonElement();
        buttonsPage.clickMeButtonElement();

       // System.out.println(buttonsPage.message1.getText());

        assertTrue(buttonsPage.message1.isDisplayed());
        assertEquals("You have done a dynamic click", buttonsPage.message1.getText());
    }
}
