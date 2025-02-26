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

        Driver.getDriver().findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Alert alert = Driver.getDriver().switchTo().alert();

        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        assertEquals("I am a JS Alert", alertText);

        alert.accept();
    }
}

