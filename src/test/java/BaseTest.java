
import UI.ScreenshotWatcher;
import UI.driver.Driver;
import UI.helper.WebElementActions;
import UI.owner.ConfigProperties;
import UI.pages.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
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
    public static WidgetsPage widgetsPage;
   static ConfigProperties config = ConfigFactory.create(ConfigProperties.class);
   public static AlertsPage2 alertsPage2;
   public static BrowserWindowsPage browserWindowsPage;
   public static NewWindowPage newWindowPage;
   public static NewWindowMessagePage newWindowMessagePage;
   public static DragAndDropPage dragAndDropPage;
   public static SliderPage sliderPage;
   public static LinksPage linksPage;
   public static WebTablesPage webTablesPage;
   public static FillFormPage fillFormPage;


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
       selectMainPage=new SelectMainPage();
       driver = Driver.getDriver();
       driver.get(config.url());
       widgetsPage = new WidgetsPage();
       alertsPage2 = new AlertsPage2();
       browserWindowsPage = new BrowserWindowsPage();
       newWindowPage = new NewWindowPage();
       newWindowMessagePage = new NewWindowMessagePage();
       dragAndDropPage = new DragAndDropPage();
       sliderPage = new SliderPage();
       linksPage = new LinksPage();
       webTablesPage = new WebTablesPage();
       fillFormPage = new FillFormPage();


       final Logger logger = LoggerFactory.getLogger(BasePage.class);


    }
    @AfterEach
    void checkTestResult(TestInfo testInfo, TestReporter testReporter) throws IOException {
        if (testInfo.getTags().contains("failed")) { // Проверяем, упал ли тест
            WebElementActions.takeScreenshot(testInfo.getDisplayName());
        }
    }
    @AfterAll
    public static void tearDown() {

        //Driver.quitDriver();
    }
}
