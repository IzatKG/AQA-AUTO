import com.github.javafaker.Faker;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilFormTest extends BaseTest{
    Faker faker= new Faker();
    String firstName = faker.name().firstName();

    @Test
    @RepeatedTest(3)
    public void checkFillFormTest(){
        fillFormPage.firstNameInputFiled.sendKeys(firstName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"BAYA","LEONID","MEDER"})
    public void checkFillFormTest1(String firstName){
        fillFormPage.firstNameInputFiled.sendKeys(firstName);
    }
}
