import UI.pages.AlertsPage;
import UI.pages.BasePage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AlertsTest extends BaseTest {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @Test
    public void alertTest(){
        mainPage.clickElemenrAlert();
        elementsPage.clickAlertElement();
        alertsPage.clickMeButton();
        Alert alert = driver.switchTo().alert();
        assertEquals("You clicked a button",alert.getText());
     alert.accept();

    }
    @Test
    public void alertTimeTest(){
        mainPage.clickElemenrAlert();
        elementsPage.clickAlertElement();
        alertsPage.timerClickMeButton();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        assertEquals("This alert appeared after 5 seconds",alert.getText());
        alert.accept();
    }

    @Test
    public void alert3Button(){
        mainPage.clickElemenrAlert();
        elementsPage.clickAlertElement();
        alertsPage.popClickMeButton();
        Alert alert = driver.switchTo().alert();
        assertEquals("Do you confirm action?",alert.getText());
        alert.accept();
    }
    @Test
    public void alertFourButton(){
        mainPage.clickElemenrAlert();
        elementsPage.clickAlertElement();
        alertsPage.promtMeButton();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("ХОХОХО");
        assertEquals("Please enter your name",alert.getText());
        alert.accept();
    }
}
