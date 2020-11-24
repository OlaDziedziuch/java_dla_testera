package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        String[] names = new String[5];

        names[0] = "Jack";
        names[1] = "John";
        names[2] = "Kate";
        names[3] = "Mary";
        names[4] = "Lou";

        System.out.println(Arrays.toString(names));
        System.out.println(names[4]);
        //System.out.println(names[17]);


        // w tej pętli potrzebny jest index, np. wyświetlenie co 2 lub trzecią wartość
        for (int i = 0; i < names.length; i++ ) {
            if (i % 2 == 0) {
            System.out.println(names[i]);
        }}

        // w tej nie, zawsze przechodzi przez wszystkie elementy tablicy
        for (String name: names) {
            System.out.println(name);
        }

        int [] numbers = new int[10];

        System.out.println("Array's length: " + numbers.length);

        int[] newNumbers = {1,2,3,4,5};

        String[] books = {"1984", "Catch 22", "Crime and punishment"};

        for (String book : books
             ) {
            System.out.println(book.toUpperCase());
        }

        for(int i=0; i < books.length; i++) {
            System.out.println(books[i].toLowerCase()
            );
        }

        String[] teas = new String[5];
        teas[0] = "white";
        teas[1] = "green";
        teas[2] = "red";
        teas[3] = "black";
        teas[4] = "oolong";

        for (String kindOfTea: teas
             ) {
            System.out.println(kindOfTea.substring(0,3));
        }

        for (int i=1; i < teas.length; i++) {
            if (i % 2 == 0) {
            System.out.println(teas[i].length());
        }}

        for (int i=0; i <teas.length; i++) {
            if (i % 2 != 0)
                System.out.println(teas[i].toUpperCase());
        }

        int number = 10;
        number = number + 1;
        number += 1;
        number++;

        System.out.println(number);



    }
}
