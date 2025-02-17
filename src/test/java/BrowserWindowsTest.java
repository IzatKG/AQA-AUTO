import UI.helper.WebElementActions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class BrowserWindowsTest extends BaseTest{

    @Test
    public void checkTabWindowTest(){
        WebElementActions.scrollToElement(driver,browserWindowsPage.tabButton);
        browserWindowsPage.tabButton.click();

        String mainWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();
        for( String window: allWindows){
            if(!window.equals(mainWindow)){
                driver.switchTo().window(window);
                break;
            }
        }

        driver.close();
        driver.switchTo().window(mainWindow);
    }
}
