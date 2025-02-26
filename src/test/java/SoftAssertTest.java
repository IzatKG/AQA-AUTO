import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Epic("")

public class SoftAssertTest {

//softAssert - Все проверки выполняются независим..
// собирает все ошибки и в конце сообщает о них

    @BeforeAll
    public static void setUp() {
        System.out.println("STARTED");
    }

    @Test
    @DisplayName("")
    public void softAssertTest() {

        assertAll("Check soft assert",
                () -> assertEquals(4, 3 + 2, "Error"),
                () -> assertTrue("HELLO".endsWith("J"), "Error"),
                () -> assertFalse("City".isEmpty(), "Error")
        );
    }
}
