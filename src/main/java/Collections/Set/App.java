package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Doris");
        names.add("Doris");
        names.add("Ethan");
        names.add("Maurie");

        System.out.println(names.size());
        System.out.println(names);

        for (String name : names
        ) {
            System.out.println(name);

        }

        Set<String> sortedSet = new TreeSet<>(names);
    }

}
