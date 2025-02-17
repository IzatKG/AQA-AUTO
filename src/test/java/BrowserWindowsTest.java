import UI.driver.Driver;
import UI.helper.WebElementActions;
import UI.pages.BrowserWindowsPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class BrowserWindowsTest extends BaseTest{
    @Test
    public void checkTabWindowsTest(){
        browserWindowsPage.tabButton.click();

        String mainWindow =driver.getWindowHandle();

        Set<String> allWindows =driver.getWindowHandles();
        for (String window:allWindows){
            if(!window.equals(mainWindow)){
                driver.switchTo().window(window);
                break;
            }

        }
        driver.close();
        driver.switchTo().window(mainWindow);
    }
    @Test
    public void checkNewWindow(){
        mainPage.clickElemenrAlert();
        elementsPage.browserWindows.click();
        browserWindowsPage.tabButton.click();
        browserWindowsPage.newWindow();
        browserWindowsPage.windowMessage.click();
    }
}
