import UI.owner.Owner;
import UI.owner.Owners;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Owner(Owners.IZAT_YKLASOV)
public class DemoTest extends BaseTest {
    @Test
    public void checkChceckboxTest(){

       WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']"));

        scrollToElement(driver,elementsButton);
        elementsButton.click();

        //WebElement checkboxBtn = driver.findElement(By.xpath("//span[text()='Check Box]"));
        //checkboxBtn.click();

        //assertTrue(checkboxBtn.isDisplayed());
        //assertTrue(checkboxBtn.isEnabled());
    }

    public static void  scrollToElement(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
