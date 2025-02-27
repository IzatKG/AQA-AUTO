
import org.junit.jupiter.api.*;

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
    }

    @Test
    @DisplayName("check the foodButton")
    @Order(1)

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
