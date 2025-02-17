
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
        textboxPage.fullForm();
        textboxPage.submitButton.click();

        assertEquals("Name:izat",textboxPage.textAfterSubmit.get(0).getText());
       // assertEquals("Email:mg@gmail.com",textboxPage.textAfterSubmit.contains("dfsds"));
        assertTrue(textboxPage.fullNameInputField.isDisplayed());
    }
}
