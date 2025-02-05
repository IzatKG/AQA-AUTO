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
}