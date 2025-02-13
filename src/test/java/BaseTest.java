
import UI.driver.Driver;
import UI.helper.WebElementActions;
import UI.owner.ConfigProperties;
import UI.pages.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    public static CheckboxPage checkboxPage;
    public static RadioButtonPage radioButtonPage;
    public static MainPage mainPage;
    public static WebElementActions webElementActions;
    public static WebDriver driver;
    public static ButtonsPage buttonsPage;
    public static ElementsPage elementsPage;
    public static DynamicPropertyPage dynamicPropertyPage;
    public static TextBoxPage textBoxPage;
    static ConfigProperties config = ConfigFactory.create(ConfigProperties.class);

    @BeforeAll
    public static void setUp() {
        checkboxPage =new CheckboxPage();
        radioButtonPage = new RadioButtonPage();
        mainPage = new MainPage();
        webElementActions = new WebElementActions();
        buttonsPage = new ButtonsPage();
        elementsPage = new ElementsPage();
        dynamicPropertyPage = new DynamicPropertyPage();
        textBoxPage = new TextBoxPage();
        // PropertyReader.readProperty();
        driver = Driver.getDriver();
        // driver.get("https://demoqa.com");

        driver.get(config.url());

    }

//    @AfterAll
//    public static void tearDown() {
//
//        Driver.quitDriver();
//    }
}