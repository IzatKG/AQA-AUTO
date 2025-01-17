package UI.tashtan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        // 1. Использование HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana", 3);
        hashMap.put("Apple", 5);
        hashMap.put("Orange", 7);
        System.out.println("HashMap (без порядка):");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 2. Использование TreeMap (сортировка по ключу)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 3);
        treeMap.put("Apple", 5);
        treeMap.put("Orange", 7);
        System.out.println("\nTreeMap (сортировка по ключу):");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 3. Использование LinkedHashMap (сохраняет порядок добавления)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Banana", 3);
        linkedHashMap.put("Apple", 5);
        linkedHashMap.put("Orange", 7);
        System.out.println("\nLinkedHashMap (порядок добавления):");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}