package bnp_ui_autotest.UI;

import bnp_ui_autotest.UI.helper.WebElementActions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.io.IOException;

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
