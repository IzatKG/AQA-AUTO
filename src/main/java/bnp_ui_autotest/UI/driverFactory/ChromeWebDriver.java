package bnp_ui_autotest.UI.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {
    public static WebDriver loadChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments(("--remote-allow-origins=*"));
        options.addArguments(("--disable-extensions"));
        options.addArguments(("--start-maximized*"));
        options.addArguments(("--window-size=1920,1080"));
        options.addArguments(("--no-sandbox"));

//
//        if (Boolean.parseBoolean(PropertyReader.getProperty("headless"))) {
//            options.addArguments("--headless");
//        }

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }
}
