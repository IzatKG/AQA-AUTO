import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends BaseTest {

    @Test
    @DisplayName("Demoga checkBox")
    public void Demoga() {
        driver.get("https://demoqa.com/checkbox");
        WebElement buttoncheck = driver.findElement(By.id("button/svg"));
        buttoncheck.click();

    }
}
