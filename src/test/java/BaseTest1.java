import UI.driver.Driver;
import UI.driverFactory.PropertyReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest1 {
    public static WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = Driver.getDriver();
        PropertyReader.readProperty();
    }

    @AfterEach
    public void tearDown() {
         Driver.quitDriver();
        }
    }
