import UI.ScreenshotWatcher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;


public class CheckDoubleClickButtonTest extends BaseTest {

    public static final String ERROR_MESSAGE = "You have done a double click";

    @Test
    @DisplayName("Check the double click")
    public void checkDoubleClick() throws IOException {
        checkboxPage.clickElementsBtn();
       // elementsPage.clickButtonElement();
        buttonsPage.doubleClickButtonElement();
        //buttonsPage.wrightClickButtonElement();

//        assertTrue(buttonsPage.message.isDisplayed());
       // assertEquals(ERROR_MESSAGE, buttonsPage.wrightClickElement.getText())//

        // implicit wait -неявное ожидание
        // explicit wait - явное ожидание (WebDriverWait, FluentWait)
    }
}
