import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chromedriver", "\"C:\\Program Files\\Google\\Chrome\\chromedriver-win64");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
@Test
@DisplayName("Demoga Resume")
    public void GoogleTest() {
    driver.get("https://demoqa.com/text-box");
    WebElement fullName= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/input"));
fullName.sendKeys("Абдымуса уулу Медер");

    WebElement email= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/input"));
email.sendKeys("abdymusaevvv@gmail.ru");

    WebElement currentAddress= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/textarea"));
    currentAddress.sendKeys("Чуйская область Чуйский Район село Кош-Кашат ул Суюнбаева N4");

WebElement permanentAddress = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[4]/div[2]/textarea"));
    permanentAddress.sendKeys("Токмок");

WebElement enterButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
enterButton.click();
}
@AfterAll
    public static void tearDown(){
//driver.quit();
}
}
