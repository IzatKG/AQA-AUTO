<<<<<<< HEAD
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
=======

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("smoke")
public class MyTest{

    @BeforeEach
    public void beforeEach(){
        System.out.println("BEFORE_EACH");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("AFTER_EACH");
    }
    @BeforeAll
    public static void setUp() {
        System.out.println("Berfore_ALL");

    }

    @AfterAll
    public static void tearDown() {
        // driver.quit();
        System.out.println("After_ALL");
    }

    @Test
    @DisplayName("check the foodButton")
    @Order(0)
    public void myFirstTest() {
        //  driver.get("  https://demoqa.com/text-box");
        System.out.println("1 test");
>>>>>>> origin
    }

    @Test
    @DisplayName("check the foodButton")
    @Order(1)
<<<<<<< HEAD
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
=======

    public void mySecondTest() {
        System.out.println("2 test");

    }
    @Test
    @DisplayName("check the foodButton")
    @Order(2)
    @Disabled("Этот тест временно отключен")
    public void myThirdTest() {
        System.out.println("3 test");

    }
}
>>>>>>> origin
