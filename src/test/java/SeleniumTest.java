

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest extends BaseTest {

    @Test
    @DisplayName("Google search test")
    public void googleTest() throws InterruptedException {
        driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F%3Flocale%3Dru_RU");
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.sendKeys("java");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("21213231");

        //  WebElement enterButton = driver.findElement(By.xpath("//button[@name='login']"));
        WebElement enterButton = driver.findElement(By.id("loginbutton"));
        enterButton.click();


        //   //button[text()='Вход']     по тексту
        //   //button[contains(text(),'Вход')]   - по тексту
    }


}
