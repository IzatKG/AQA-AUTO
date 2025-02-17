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

    public static void takeScreenshot(String testName) throws IOException {
        if (Driver.getDriver() == null) {
            System.out.println("Driver is null");
            return;
        }

        String folderPath = "screenshots";
        Files.createDirectories(Paths.get(folderPath));

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String screenshotName = testName.replaceAll("[^a-zA-Z0-9.-]", "_") + "_" + timestamp + ".png";
        String screenshotPath = folderPath + "/" + screenshotName;

        File screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File destination = new File(screenshotPath);
        Files.copy(screenshot.toPath(), destination.toPath());

        System.out.println("Screenshot saved: " + destination.getAbsolutePath());
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public WebElementActions click(WebElement element){
        element.click();
        return this;
    }
}
