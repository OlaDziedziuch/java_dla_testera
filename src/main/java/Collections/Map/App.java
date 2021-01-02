package Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();

        names.put(12, "Jack");
        names.put(2, "Jack");
        names.put(30, "Jack");
        names.put(4, "Jack");

        System.out.println(names);

        Map<Integer, String> sortedNames = new TreeMap<>(names);

        System.out.println(sortedNames);

        for (Map.Entry<Integer, String> entry: names.entrySet()
             ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            
        }


    }

}
