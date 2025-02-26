import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

public class SliderTest extends BaseTest {

    @Test
    public void sliderTest() {
        sliderPage.moveSlider();


    }
}
