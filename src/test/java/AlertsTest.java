import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@Story("")
public class AlertsTest extends BaseTest {

    @Test
    public void alertTest() {
        alertsPage.clickMeButton();
        Alert alert = driver.switchTo().alert();

        assertEquals("You clicked a button", alert.getText());

        alert.accept();

    }
}

