import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MyTest {

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("SSSS");
    }

    @Test
    @DisplayName("check the foodButton")
    @Order(1)
    @Disabled("Этот тест временно отключен")
    public void myFirstTest() {
        System.out.println(" My Test ");
        // driver https://demoqa.com/text-box
    }

    @Test
    @DisplayName("check the foodButton")
    @Order(2)
    @Tag("Smoke")
    public void mySecondTest() {
        System.out.println("2 test");
    }

    @Test
    @DisplayName("check the foodButton")
    @Order(2)
    public void myTreTest() {
        System.out.println("3 test");
    }
}