package UI.CodingBat;

public class Map2CodingBat {

    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str; // Если длина строки меньше двух, возвращаем её полностью
        }
        return str.substring(0, 2); // Иначе возвращаем первые два символа
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.println(firstTwo("Hello"));   // He
        System.out.println(firstTwo("abcdefg")); // ab
        System.out.println(firstTwo("ab"));      // ab
        System.out.println(firstTwo("a"));       // a
        System.out.println(firstTwo(""));        // (пустая строка)
    }
}


