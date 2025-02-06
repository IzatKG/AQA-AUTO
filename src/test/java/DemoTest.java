import UI.owner.Owner;
import UI.owner.Owners;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static UI.pages.CheckboxPage.scrollToElement;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Owner(Owners.TOBOKELOV_JOLDOSH)
public class DemoTest extends BaseTest {

    @Test
    public void checkboxTest() {
        checkboxPage.elementsButton.click();
    }

    @Test
    @DisplayName("Checkbox test")
    public void checkCheckboxTest() {
        WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']"));
        scrollToElement(driver, elementsButton);
        elementsButton.click();
    }

    @Test
    @DisplayName("Demo test")
    public void demoTest() {//span[@class='rct-checkbox'][1]

//        WebElement checkboxBtn = driver.findElement(By.xpath("//span[text()='Check Box"));
//        checkboxBtn.click();
//        WebElement checkElement = driver.findElement(By.xpath("//button[@title='Toggle'][1]"));
//        checkElement.click();//button[@title='Toggle'][1]
//        assertTrue(checkElement.isDisplayed());
//        assertTrue(checkElement.isEnabled());
//
//        WebElement expandElement = driver.findElement(By.xpath("//button[@aria-label='Expand all']"));
//        expandElement.click();
//
//        WebElement checkElement1 = driver.findElement(By.xpath("//label[@for='tree-node-commands']"));
//        checkElement1.click();//span[text()='Desktop'] //span[@class='rct-text']
//        //label[@for='tree-node-desktop']
//
//        WebElement argElement = driver.findElement(By.xpath("//label[@for='tree-node-react']"));
//        argElement.click();
//
//        WebElement publicElement = driver.findElement(By.xpath("//label[@for='tree-node-public']"));
//        publicElement.click();
//
//        WebElement privateElement = driver.findElement(By.xpath("//label[@for='tree-node-private']"));
//        privateElement.click();
//
//        WebElement downloadElement = driver.findElement(By.xpath("//label[@for='tree-node-downloads']"));
//        downloadElement.click();
//
    }

//    public static void scrollToElement(WebDriver driver, WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeAsyncScript("arguments[0].scrollIntoView(true);", element);
//    }
}
