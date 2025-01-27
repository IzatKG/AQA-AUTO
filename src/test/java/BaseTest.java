<<<<<<< HEAD
=======

import UI.driver.Driver;
import UI.driverFactory.PropertyReader;
>>>>>>> origin
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeOptions;
=======
>>>>>>> origin

import java.time.Duration;

public class BaseTest {
<<<<<<< HEAD

=======
>>>>>>> origin
    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
<<<<<<< HEAD
        System.setProperty("webdriver.chromedriver", "\"C:\\Program Files\\Google\\Chrome\\chromedriver-win64");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @AfterAll
    public static void tearDown() {
        //driver.quit();
    }

}
=======
        PropertyReader.readProperty();
        driver = Driver.getDriver();
    }


    @AfterAll
    public static void tearDown() {
      Driver.quitDriver();
    }
}
>>>>>>> origin
