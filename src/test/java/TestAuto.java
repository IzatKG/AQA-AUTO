import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestAuto {

    private WebDriver driver;

    @BeforeEach
    public void setup() {
        // Устанавливаем путь к chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver-win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // Инициализация драйвера
    }

    @AfterEach
    public void tearDown() {
        // Закрываем браузер после теста
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("Google search test")
    public void googleTest() {
        // Открываем страницу Facebook
        driver.get("https://www.facebook.com/?locale=ru_RU");

        // Находим поле для email и вводим значение
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.sendKeys("Java");

        // Находим поле для пароля и вводим значение
        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.sendKeys("138800");


    }
}
