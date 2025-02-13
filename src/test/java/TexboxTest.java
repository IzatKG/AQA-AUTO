
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TexboxTest extends BaseTest {

    @Test
    @DisplayName("Проверка регистрации с данными")
    void checkRegistrationForm() {
        checkboxPage.clickElementsBtn();
        elementsPage.textBoxButton.click();
        textboxPage.fillForm();
        textboxPage.submitButton.click();

        assertTrue(textboxPage.fullNameInputField.isDisplayed());
    }
}
