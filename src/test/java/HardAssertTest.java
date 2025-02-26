import io.qameta.allure.Step;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HardAssertTest {

    @Test
    @Order(0)
    public void hardAssetTest(){

        System.out.println("Started");
        int expected = 10;

        assertEquals(expected, sumOfTwoNumbers(7,2),"ошибка в первои проверки");

        System.out.println("ERROR");
    }

    @Test
    @Order(1)
    public void hardAssetTest2(){

        System.out.println("Started");
        int expected = 10;

        assertEquals(expected, sumOfTwoNumbers(4,8),"ошибка во втором проверки");

        System.out.println("ERROR");
    }

    @Step("Sum of 2 numbers")
    public int sumOfTwoNumbers(int a, int b){
        return a+b;
    }
}
