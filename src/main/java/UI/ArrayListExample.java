package UI;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Создание ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Добавление элементов
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Вывод списка
        System.out.println("List after adding elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Получение элемента по индексу
        String fruitAtIndex1 = list.get(1);  // Получаем элемент на индексе 1
        System.out.println("\nElement at index 1: " + fruitAtIndex1);

        // Изменение элемента по индексу
        list.set(1, "Grapes");
        System.out.println("\nList after updating index 1:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Удаление элемента по индексу
        list.remove(0);  // Удаление первого элемента (по индексу 0)
        System.out.println("\nList after removing element at index 0:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Проверка, содержит ли список элемент
        boolean containsBanana = list.contains("Banana");
        System.out.println("\nDoes the list contain 'Banana'? " + containsBanana);

        // Получение размера списка
        int size = list.size();
        System.out.println("\nSize of the list: " + size);

        // Очистка списка
        list.clear();
        System.out.println("\nList after clearing all elements:");
        System.out.println("Size: " + list.size());
    }
}