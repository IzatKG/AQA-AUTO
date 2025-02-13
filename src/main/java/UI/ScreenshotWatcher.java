package UI;

import UI.helper.WebElementActions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.io.IOException;
import java.util.Optional;

public class ScreenshotWatcher implements TestWatcher {
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        try {
            WebElementActions.takeScreenshot(testName); // Вызываем статический метод напрямую
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при создании скриншота", e);
        }
    }
}
