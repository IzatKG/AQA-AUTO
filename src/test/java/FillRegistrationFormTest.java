import org.junit.jupiter.api.Test;

public class FillRegistrationFormTest extends BaseTest{

    @Test
    public void checkRegistrationForm(){
        checkboxPage.elementsButton.click();
        elementsPage.textBoxButton.click();
        textBoxPage
                .fillRegistrationForm();
    }

}
