import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestQa {
    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver-win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Открыть браузер на весь экран
    }

    @AfterAll
    public static void tearDown() {
        //  Закрываем браузер после теста
       //  if (driver != null) {
        //    driver.quit();
      //  }
    }

    @Test
        @DisplayName("DemoQa field test")
        @Order(1)
        public void DemoTest() {
            // Открываем страницу DemoQa
            driver.get("https://demoqa.com/text-box");

            // Находим поле для FullName и вводим значение
            WebElement userNameField = driver.findElement(By.xpath("//input[@id='userName']"));
            userNameField.sendKeys("Leonid Gavrilov");

            // Находим поле для Email и вводим значение
            WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
            emailField.sendKeys("EbaYaProgrammist@mail.ru");

            // Находим поле для Current Address и вводим значение
            WebElement addressField = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
            addressField.sendKeys("Пересечение улиц \"возьми карту\" и \"поищи сам\", умник");

            // Находим поле для Permanent Address и вводим значение
            WebElement PermanentAddressField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
            PermanentAddressField.sendKeys("Улица Пушкина, дом Колотушкина");

            // Находим кнопку по идентификатору
            WebElement button = driver.findElement(By.id("submit"));

            // Прокручиваем до кнопки
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);

            // Кликаем по кнопке
            button.click();




        }
}

