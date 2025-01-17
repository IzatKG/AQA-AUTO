package UI.CodingBat;

import java.util.HashMap;
import java.util.Map;

public class MapOneCodingBat {

        public static Map<String, String> mapBully(Map<String, String> map) {
            if (map.containsKey("a")) {
                map.put("b", map.get("a")); // Перемещаем значение из 'a' в 'b'
                map.put("a", "");           // Устанавливаем значение ключа 'a' как пустую строку
            }
            return map;
        }

        public static void main(String[] args) {
            // Примеры использования:
            Map<String, String> map1 = new HashMap<>();
            map1.put("a", "candy");
            map1.put("b", "dirt");
            System.out.println(mapBully(map1)); // {a=, b=candy}

            Map<String, String> map2 = new HashMap<>();
            map2.put("a", "candy");
            System.out.println(mapBully(map2)); // {a=, b=candy}

            Map<String, String> map3 = new HashMap<>();
            map3.put("b", "carrot");
            System.out.println(mapBully(map3)); // {b=carrot}
        }
    }



