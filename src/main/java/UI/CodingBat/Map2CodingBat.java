package UI.CodingBat;

public class Map2CodingBat {

    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
        System.out.println(firstTwo("a"));
        System.out.println(firstTwo(""));
    }
}


