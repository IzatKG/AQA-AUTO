package UI.Leonid;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a") && map.get("a") != null) {
            map.put("b", map.get("a")); // Переносим значение из "a" в "b"
            map.put("a", "");           // Очищаем "a"
        }
        return map;
    }

    public static void main(String[] args) {
        // Тестовые примеры
        Map<String, String> test1 = new HashMap<>();
        test1.put("a", "candy");
        test1.put("b", "dirt");
        System.out.println("Test 1: " + mapBully(test1)); // Ожидаем {"a": "", "b": "candy"}

        Map<String, String> test2 = new HashMap<>();
        test2.put("a", "candy");
        System.out.println("Test 2: " + mapBully(test2)); // Ожидаем {"a": "", "b": "candy"}

        Map<String, String> test3 = new HashMap<>();
        test3.put("a", "candy");
        test3.put("b", "carrot");
        test3.put("c", "meh");
        System.out.println("Test 3: " + mapBully(test3)); // Ожидаем {"a": "", "b": "candy", "c": "meh"}
    }
}

