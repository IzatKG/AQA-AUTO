import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;



    public class TestQa {

        private WebDriver driver;

        @BeforeEach
        public void setup() {
            // Устанавливаем путь к chromedriver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver-win32\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(); // Инициализация драйвера
            driver.manage().window().maximize(); // Открыть браузер на весь экран

        }

        @AfterEach
        public void tearDown() {
            //  Закрываем браузер после теста
            // if (driver != null) {
            //  driver.quit();
            //  }
        }

        @Test
        @DisplayName("DemoQa field test")
        public void DemoTest() {
            // Открываем страницу DemoQa
            driver.get("https://demoqa.com/text-box");

            // Находим поле для FullName и вводим значение
            WebElement userNameField = driver.findElement(By.xpath("//input[@id='userName']"));
            userNameField.sendKeys("Leonid Gavrilov");

            // Находим поле для Email и вводим значение
            WebElement emailField = driver.findElement(By.xpath("//input[@id='userEmail']"));
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

