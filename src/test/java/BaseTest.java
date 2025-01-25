
import UI.driver.Driver;
import UI.driverFactory.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        PropertyReader.readProperty();
        driver = Driver.getDriver();
    }


    @AfterAll
    public static void tearDown() {
      Driver.quitDriver();
    }
}
