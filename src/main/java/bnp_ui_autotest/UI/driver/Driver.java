package bnp_ui_autotest.UI.driver;

import bnp_ui_autotest.UI.driverFactory.ChromeWebDriver;
import bnp_ui_autotest.UI.driverFactory.EdgeWebDriver;

import bnp_ui_autotest.UI.owner.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Driver {
 private static WebDriver driver;
    //Singleton- паттерн проектирование -> приватный конструктор

    static ConfigProperties config = ConfigFactory.create(ConfigProperties.class);
    private Driver(){
    }

    public static WebDriver getDriver(){
        if(driver==null) {
      // String browser = PropertyReader.getProperty("browser");
            String browser = config.browser();
       switch (browser.toLowerCase()){
           case "chrome":
               driver = ChromeWebDriver.loadChromeDriver();
               break;
           case "edge":
               driver = EdgeWebDriver.loadEdgeDriver();
               break;
           default:
               throw new WebDriverException("Browser is null: " + browser);
       }

        }
        return driver;
        }

        public static void quitDriver(){
        if(driver!=null){
            driver.quit();
        }
        }
    }

