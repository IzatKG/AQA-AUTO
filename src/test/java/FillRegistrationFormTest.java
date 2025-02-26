import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;



@Tag("Smoke")
public class FillRegistrationFormTest extends BaseTest {

    @BeforeAll
    public static void setUp() {
        checkboxPage.clickElementsBtn();
        elementsPage.textBoxButton.click();
    }
}

 /*   @ParameterizedTest
    @CsvSource({"izat, msn@gamil.com, aven street, kkk 14",
            "4536543453453453.453453453453, mjk@gamil.com, tkol street, kkk 15",
            "@$#%%#%^(*%(#&I:LFGSG:SE6+16D, yyyk@gamil.com, tyrty street, kkk 1545"
    })
  //  public void checkRegistrationForm(String fullName, String email, String currentAddress, String permanentAddress) {
        // textboxPage.fullNameInputField.sendKeys(fullName);
      //  textboxPage.emailInputField.sendKeys(email);
       // textboxPage.currentAddressInputField.sendKeys(currentAddress);
       // textboxPage.permanentAddressInputField.sendKeys(permanentAddress);
  //*/

   /* @ParameterizedTest
    @MethodSource({"userData"})
    public void checkRegistrationForm1(String fullName, String email, String currentAddress, String permanentAddress) {
//textboxPage.fullNameInputField.sendKeys(fullName);
      //  textboxPage.emailInputField.sendKeys(email);
      //  textboxPage.currentAddressInputField.sendKeys(currentAddress);
      //  textboxPage.permanentAddressInputField.sendKeys(permanentAddress);
        driver.navigate().refresh();
    }*/
/*
    static Stream<Arguments> userData (){
        return Stream.of(
                Arguments.of("Kanat", "email@.ru", "fgfhgfhg", "45"),
                Arguments.of("meder", "email@gamil.com", "fgfhgfhg", "44"),
                Arguments.of("Azamat", "email@.ru", "fgfhgfhg", "48")
        );*/

