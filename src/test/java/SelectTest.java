import UI.pages.SelectMainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelectTest extends BaseTest {
    @Test
    public void checkOldSelectElements() {
        mainPage.clickWidgetButton();
        widgetsPage.clickMenuSelect();
        selectMainPage.selectElementByText("Yellow");

        assertTrue(selectMainPage.oldSelectElement.isSelected());



       //Select select = new Select(selectMainPage.selectElement);
        //select.deselectByVisibleText("Hyundai");
       // select.selectByIndex(2);
       // List<WebElement> options = select.getOptions();
      //  for (WebElement option : options) {
        //    System.out.println(option.getText() + "  Names");
       // Для выбора Из ДропДаунов }
    }

    @Test
    public void checkButton2() {
        selectMainPage.button2.click();

    }
}