import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo extends BaseTest {
    @Test
    public void demoTest(){
        driver.get("https://demoqa.com/text-box");
        WebElement currenAddress = driver.findElement(By.id("currentAddress"));
        currenAddress.sendKeys("NNNNNNNNbomba");
        Assertions.assertTrue(currenAddress.isDisplayed());
    }
}
