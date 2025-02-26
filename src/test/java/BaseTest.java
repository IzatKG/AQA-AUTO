
import bnp_ui_autotest.UI.ScreenshotWatcher;
import bnp_ui_autotest.UI.driver.Driver;
import bnp_ui_autotest.UI.helper.WebElementActions;
import bnp_ui_autotest.UI.owner.ConfigProperties;
import bnp_ui_autotest.UI.pages.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
@ExtendWith(ScreenshotWatcher.class)
public abstract class BaseTest {
   public static CheckboxPage checkboxPage;
   public static RadioButtonPage radioButtonPage;
   public static MainPage mainPage;
   public static WebElementActions webElementActions;
    public static WebDriver driver;
    public static ButtonsPage buttonsPage;
    public static ElementsPage elementsPage;
    public static DynamicPropertyPage dynamicPropertyPage;
    public static AmazonMainpage amazonMainpage;
    public static TextboxPage textboxPage;
    public static SelectMainPage selectMainPage;
    public static WidgetsPage widgetsPage;

    public static AlertsPage alertsPage;
    public static BrowserWindowsPage browserWindowsPage;
    public static DropablePage dropablePage;
    public static SliderPage sliderPage;
    public static FillFormPage fillFormPage;
   static ConfigProperties config = ConfigFactory.create(ConfigProperties.class);

    public static final Logger logger = LoggerFactory.getLogger(BasePage.class);
   public static String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
    @BeforeAll
    public static void setUp() {
       checkboxPage =new CheckboxPage();
       radioButtonPage = new RadioButtonPage();
       mainPage = new MainPage();
       webElementActions = new WebElementActions();
       buttonsPage = new ButtonsPage();
       elementsPage = new ElementsPage();
       dynamicPropertyPage =new DynamicPropertyPage();
       amazonMainpage =new AmazonMainpage();
       textboxPage =new TextboxPage();
       selectMainPage = new SelectMainPage();
       widgetsPage = new WidgetsPage();
       alertsPage = new AlertsPage();
       browserWindowsPage = new BrowserWindowsPage();
       dropablePage = new DropablePage();
       sliderPage = new SliderPage();
       fillFormPage = new FillFormPage();
         driver = Driver.getDriver();
        driver.get(config.url());


        logger.info("TEST STARTED!!!" );
        logger.warn("ATTENTION!!!");
        logger.error("Something went wrong!!!");

    }
    @AfterEach
    void checkTestResult(TestInfo testInfo, TestReporter testReporter) throws IOException {
        if (testInfo.getTags().contains("failed")) { // Проверяем, упал ли тест
            WebElementActions.takeScreenshot(testInfo.getDisplayName());
        }

        logger.info("STARTED in method: {}", Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    @AfterAll
    public static void tearDown() {

        Driver.quitDriver();
    }
}
