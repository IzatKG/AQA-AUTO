import org.junit.jupiter.api.Test;

import java.util.Set;

public class NewWindowMessageTest extends BaseTest{
    @Test
    public void newWindowMessageTest() {

        String mainWindow = driver.getWindowHandle();
      //  newWindowMessagePage.NewWindowMessageClick();

        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // String pageText = driver.findElement(By.tagName("body")).getText();
        // assertEquals("njknbkjhn",newWindowMessagePage.newWindowText.getText());

        driver.close();
        driver.switchTo().window(mainWindow);
    }
}
