package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        ArrayList <String> namesTitanic = new ArrayList<>();
        ArrayList <String> namesTarzan = new ArrayList<>();

        namesTitanic.add("Jack");
        namesTitanic.add("Rose");
        namesTarzan.add("Jane");
        namesTarzan.add("Tarzan");

        System.out.println(namesTarzan);

        for (String name:namesTarzan
             ) {
            System.out.println(name);

        }

    //namesTarzan.remove(0);
        //System.out.println(namesTarzan);

    //namesTitanic.remove("Rose");
        //System.out.println(namesTitanic);

    //String name = namesTarzan.get(1);
      //  System.out.println(name);

        System.out.println(namesTitanic.size());
        System.out.println(namesTitanic.isEmpty());
        System.out.println(namesTitanic.contains("Jack"));
        System.out.println(namesTitanic.equals(namesTarzan));
        System.out.println(namesTarzan.addAll(namesTitanic));
        System.out.println(namesTarzan);
        //System.out.println(namesTarzan.removeAll(namesTarzan));
        //System.out.println(namesTarzan);

        Collections.sort(namesTarzan);
        System.out.println(namesTarzan);
    }




}
