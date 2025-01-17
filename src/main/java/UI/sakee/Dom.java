package UI.sakee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dom {
    public static void main(String[] args) {
        List<String> mustang =new ArrayList<>();
        mustang.add("Mers");
        mustang.add("BMW");
        mustang.add("Mazda");
        mustang.add("Audi");
        mustang.add("KIA");

        long m1 = mustang.stream().filter(m -> m.startsWith("M")).count();
        System.out.println("Result:" + m1);
    }
}
