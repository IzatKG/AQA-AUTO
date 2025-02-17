
import UI.ScreenshotWatcher;
import UI.driver.Driver;
import UI.helper.WebElementActions;
import UI.owner.ConfigProperties;
import UI.pages.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

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
    public static SelectMainPage button2;
    public static WidgetsPage widgetsPage;
    public static AlertsPage alertsPage;
    public static BrowserWindowsPage browserWindowsPage;

   static ConfigProperties config = ConfigFactory.create(ConfigProperties.class);

public static String methodName =Thread.currentThread().getStackTrace()[1].getMethodName();

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
       selectMainPage =new SelectMainPage();
       button2 = new SelectMainPage();
       widgetsPage =new WidgetsPage();
       alertsPage =new AlertsPage();
       browserWindowsPage=new BrowserWindowsPage();
         driver = Driver.getDriver();
        driver.get(config.url());


    }
    @AfterEach
    void checkTestResult(TestInfo testInfo, TestReporter testReporter) throws IOException {
        if (testInfo.getTags().contains("failed")) { // Проверяем, упал ли тест
            WebElementActions.takeScreenshot(testInfo.getDisplayName());
        }
    }
    @AfterAll
    public static void tearDown() {
        Driver.quitDriver();
    }
}
