import UI.driver.Driver;
import UI.helper.WebElementActions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlertsTest extends BaseTest {

    @Test
    public void alertTest() {
        alertsPage.clickMeButton();
        Alert alert = driver.switchTo().alert();

        assertEquals("You clicked a button", alert.getText());

        alert.accept();

    }
}

