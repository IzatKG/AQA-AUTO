<<<<<<< HEAD
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
=======


import org.junit.jupiter.api.*;
>>>>>>> origin
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest extends BaseTest {

    @Test
<<<<<<< HEAD
    @DisplayName("Demoga Resume")
    public void GoogleTest() {
        driver.get("https://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Абдымуса уулу Медер");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("abdymusaevvv@gmail.ru");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Чуйский Район село Кош-Кашат ул Суюнбаева N4");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Токмок");

        WebElement enterButton = driver.findElement(By.id("submit"));
        enterButton.click();
        WebElement enterButton2 = driver.findElement(By.id("submit"));
        enterButton.click();

=======
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
>>>>>>> origin
    }


}
