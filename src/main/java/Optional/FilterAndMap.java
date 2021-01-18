package Optional;

import java.util.ArrayList;
import java.util.List;

public class FilterAndMap {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Bartek");
        names.add("Antek");
        names.add("Tomek");
        names.add("Filip");
        names.add("Romek");
        names.add("Franek");
        names.add("Artur");
        names.add("Feliks");
        names.add("Ola");
        names.add("Ewa");

        names.stream()
                .filter(str -> str.startsWith("F"))
                .filter(str -> str.contains("k"))
                .filter(str -> str.endsWith("s"))
                .forEach(str -> System.out.println(str));


        names.stream()
                .filter(str -> str.contains("o"))
                .filter(str -> str.endsWith("mek"))
                .forEach(str -> System.out.println(str));


        names.stream()
                .map(str -> str.toUpperCase()) // metoda pośrednia
                .forEach(str -> System.out.println(str)); // metoda terminalna


        names.stream()
                .filter(str -> str.length() <= 3)
                .map(str -> "Short name " + str)
                .forEach(str -> System.out.println(str));


        long count = names.stream()
                .filter(str -> str.length() <= 3)
                .count();

        System.out.println(count);
    }
}
