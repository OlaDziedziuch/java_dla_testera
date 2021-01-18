package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MatchMethods {

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

        boolean allMatch = names.stream()
                .allMatch(s -> s.contains("a"));

        System.out.println("All match contains 'a':" + allMatch);

        boolean lessThan4 = names.stream()
                .allMatch(s -> s.length() > 2);

        System.out.println("Less than 4: " + lessThan4);

        boolean anyMatch = names.stream()
                .anyMatch(s -> s.contains("a"));

        System.out.println("Any match with 's':" + anyMatch);

        boolean noneMatch = names.stream()
                .noneMatch(s -> s.contains("ks"));

        System.out.println("Contains 'ks': " + noneMatch);

        boolean noneSkiEnd = names.stream()
                .noneMatch(s -> s.endsWith("ski"));

        System.out.println("None match 'ski' ends: " + noneMatch);

        List<String> startedWithF = names.stream()
                .filter(s -> s.startsWith("F"))
                .collect(Collectors.toList());

        System.out.println(startedWithF);

    }

}

