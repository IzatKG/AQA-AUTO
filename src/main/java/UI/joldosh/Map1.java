package UI.joldosh;

import java.util.HashMap;
import java.util.Map;


public class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> spisokOfStudents = new HashMap<>();
        spisokOfStudents.put("Sake", 35);
        spisokOfStudents.put("Ermek", 33);
        spisokOfStudents.put("Askat", 17);
        spisokOfStudents.put("Meder", 29);
        spisokOfStudents.put("Baya", 30);
        spisokOfStudents.put("Beka", 19);
        spisokOfStudents.put("Nurdin", 21);

        spisokOfStudents.entrySet().stream()
                .filter(s -> s.getValue() >= 17 && s.getValue() <= 29)
                .map(Map.Entry::getKey).forEach(System.out::println);

    }
}
