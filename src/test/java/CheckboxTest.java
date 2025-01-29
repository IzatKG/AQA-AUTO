
import UI.owner.Owner;
import UI.owner.Owners;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@Owner(Owners.IZAT_YKLASOV)
public class CheckboxTest extends BaseTest {

    @Test
    public void checkboxTest(){
        checkboxPage
                .elementsButton.click();

    }


    @Test
    public void checkCheckboxTest() {
        

    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
