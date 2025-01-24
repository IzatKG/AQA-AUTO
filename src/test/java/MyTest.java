import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {

    public static void main(String[] args) {

    }

   @Test
   @DisplayName("check the foodButton")
    public void myFirstTest(){
       System.out.println("My Test ");
   }

    public static class TestQa {

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
            emailField.sendKeys("popizde@mail.ru");

            // Находим поле для Адреса и вводим значение
            WebElement addresField = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
            addresField.sendKeys("Пересечение улиц \"возьми карту\" и \"поищи сам\", умник");




        }
    }
}
