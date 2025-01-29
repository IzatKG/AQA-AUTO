
import UI.driver.Driver;
import UI.driverFactory.PropertyReader;
import UI.helper.WebElementActions;
import UI.owner.ConfigProperties;
import UI.pages.CheckboxPage;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {
   public static CheckboxPage checkboxPage;
   public static WebElementActions webElementActions;
    public static WebDriver driver;
   static ConfigProperties config = ConfigFactory.create(ConfigProperties.class);

    @BeforeAll
    public static void setUp() {
       checkboxPage =new CheckboxPage();
       webElementActions = new WebElementActions();
        // PropertyReader.readProperty();
         driver = Driver.getDriver();
       // driver.get("https://demoqa.com");

        driver.get(config.url());

    }


    @AfterAll
    public static void tearDown() {
      //  Driver.quitDriver();
    }
}
