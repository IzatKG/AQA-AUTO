import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelectTest extends BaseTest{

    @Test
    public void checkOldSelectElements(){

        mainPage.clickWidgetButton();
        widgetsPage.clickMenuSelect();
        selectMainPage.selectElementByText("Yellow");
//        selectMainPage.selectElementByText("Green");
//        selectMainPage.selectElementByText("Red");


    }
}
