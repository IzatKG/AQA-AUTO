package UI.helper;

import UI.driver.Driver;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WebElementActions {

    public WebElementActions click(WebElement element){
        element.click();
        return this;
    }

    public WebElementActions takeScreenShot() throws IOException{
        String folderPath = "screenshots";
        Files.createDirectories(Paths.get(folderPath));
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHss"));
        String screenShotPath = folderPath + "/screenshot_" + timeStamp + ".png";
        File screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        Files.copy(screenShot.toPath(), Paths.get(screenShotPath));
        return this;
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
