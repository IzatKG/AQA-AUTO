package UI.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExemple {
    public static void main(String[] args) {

        Map<String, Integer> spisokOfRab = new HashMap<>();
        spisokOfRab.put("Maks", 23);
        spisokOfRab.put("Mara", 34);
        spisokOfRab.put("Masha", 19);
        spisokOfRab.put("Bakyt", 43);
        spisokOfRab.put("Alisa", 25);
        spisokOfRab.put("Kana", 20);
        spisokOfRab.put("kuba", 21);

        List spi = spisokOfRab.entrySet().stream()
                .filter(n -> n.getValue() >= 20 && n.getValue() <= 34)
                .map(Map.Entry::getKey).toList();
        System.out.println("Result:" + spi);
    }

}
