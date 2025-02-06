import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RightClickMe extends BaseTest{

    @Test
    @DisplayName("Check the double click")
    public void checkDoubleClick() {
        checkboxPage.clickElementsBtn();
        elementsPage.clickButtonElement();
        buttonsPage.doubleClickButtonElement();



    }
}
