
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TexboxTest extends BaseTest {

    @Test
    @DisplayName("Проверка регистрации с данными")
    void checkRegistrationForm() {
        checkboxPage.clickElementsBtn();
        elementsPage.textBoxButton.click();
        textboxPage.fillForm();
        textboxPage.submitButton.click();

        assertEquals("Name:IZat", textboxPage.textAfterSubmit.get(0).getText());
       // assertTrue(textboxPage.textAfterSubmit.contains("hjkl;@w"));

        assertTrue(textboxPage.fullNameInputField.isDisplayed());
    }
}
