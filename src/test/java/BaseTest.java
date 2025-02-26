
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
    public static AmazonMainpage amazonMainpage;
    public static TextboxPage textboxPage;
    public static SelectMainPage selectMainPage;
    public static WidgetsPage widgetsPage;
    public static AlertsPage2 alertsPage2;
    public static BrowserWindowsPage browserWindowsPage;
    public static NewWindowPage newWindowPage;
    public static NewWindowMessagePage newWindowMessagePage;
    public static FillFormPage fillFormPage;

   static ConfigProperties config = ConfigFactory.create(ConfigProperties.class);

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
        fillFormPage = new FillFormPage();
        // PropertyReader.readProperty();
         driver = Driver.getDriver();
       // driver.get("https://demoqa.com");

        driver.get(config.url());

    }

    @AfterAll
    public static void tearDown() {

        Driver.quitDriver();
    }
}
