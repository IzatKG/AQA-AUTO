package UI.Leonid;

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a"); // Удаляем ключ "a"
            map.remove("b"); // Удаляем ключ "b"
        }
        return map;
    }

    public static void main(String[] args) {
        // Тестовые примеры
        Map<String, String> test1 = new HashMap<>();
        test1.put("a", "aaa");
        test1.put("b", "aaa");
        test1.put("c", "cake");
        System.out.println("Test 1: " + mapAB2(test1)); // Ожидаем {"c": "cake"}

        Map<String, String> test2 = new HashMap<>();
        test2.put("a", "aaa");
        test2.put("b", "bbb");
        System.out.println("Test 2: " + mapAB2(test2)); // Ожидаем {"a": "aaa", "b": "bbb"}

        Map<String, String> test3 = new HashMap<>();
        test3.put("a", "aaa");
        test3.put("b", "bbb");
        test3.put("c", "aaa");
        System.out.println("Test 3: " + mapAB2(test3)); // Ожидаем {"a": "aaa", "b": "bbb", "c": "aaa"}

        System.out.println("STASH");
    }
}
