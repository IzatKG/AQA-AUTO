import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;

import java.awt.*;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class DragElementTest extends BaseTest{

    @Test
    @DisplayName("Check the dropped text")
    public void dragElementTest(){
        dropablePage.dragElement();

        assertTrue(dropablePage.droppedText.isDisplayed());
        assertEquals("droppe", dropablePage.droppedText.getText());
    }

    @Test
    @DisplayName("Check the dropped px")
    public void dragElementTest1(){
        dropablePage.dragElementTo();

        Point startLocation = dropablePage.dragElement.getLocation();
        System.out.println(startLocation);

       // assertTrue(dropablePage.droppedText.isDisplayed());
        //assertEquals("droppe", dropablePage.droppedText.getText());
    }
}
