
import UI.owner.Owner;
import UI.owner.Owners;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Owner(Owners.IZAT_YKLASOV)
public class CheckboxTest extends BaseTest {

    @Epic("Valid checkbox")
    @Feature("click functionality")
    @Test
    public void checkboxTest() {
     checkboxPage
             .clickElementsBtn()
             .clickCheckboxBtnAndToggler();

       assertTrue(checkboxPage.checkboxButton.isEnabled());
    }













    @Test
    public void checkCheckboxTest() {
        //  WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']"));
        // scrollToElement(driver, elementsButton);
        //elementsButton.click();
        //  WebElement checkboxBtn = driver.findElement(By.xpath("//span[text()='Check Box']"));
        // checkboxBtn.click();

        //  assertTrue(checkboxBtn.isDisplayed());
        // assertTrue(checkboxBtn.isEnabled());


        // driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        // WebElement documentChekcbox = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));

        // scrollToElement(driver,documentChekcbox);
    }


}
