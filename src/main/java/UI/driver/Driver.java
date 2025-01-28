package UI.driver;

import UI.driverFactory.ChromeWebDriver;
import UI.driverFactory.PropertyReader;
import UI.owner.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.edge.EdgeDriver;

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
               System.setProperty("webfriver.edge.driver","src/main/.........");
               driver = new EdgeDriver();
               break;
           default:
               throw new WebDriverException("Указанный браузер не поддерживается : " + browser);
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

