package UI.driverFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    private static Properties properties;

    public static Properties readProperty() {
        if (properties == null) {
            properties = new Properties();
            String filePath = "srs/main/resources/config.properties";
            try (FileInputStream input = new FileInputStream(filePath)) {
                properties.load(input);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Не удалось загрузить файл свойств");


            }
        }
        return properties;
    }

    public static String getProperty(String key) {
        if (properties == null) {
            throw new IllegalStateException("Свойства не загружены");
        }
        String value = properties.getProperty(key);
        if (value == null) {
            throw new IllegalArgumentException("Ключ отсутсвует");
        }
        return value.trim();


    }
}
