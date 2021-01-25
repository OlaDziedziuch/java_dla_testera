package Homework10;

import Enums.Gender;
import Homework8.BugReporter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyApp {

    public static void main(String[] args) throws IOException {

        // Homework10 PART 1 - 4. new users list

        List<User> testers = new ArrayList();

        testers.add(new User("Cinderella", "WithoutShoe", "email@wp.pl", 53, true, Gender.WOMAN));
        testers.add(new User("Alice", "InWonderland", "email@wp.pl", 33, true, Gender.WOMAN));
        testers.add(new User("Pinocchio", "FromGepetto", "email@wp.pl", 23, true, Gender.MAN));
        testers.add(new User("Snow", "White", "email@wp.pl", 43, true, Gender.WOMAN));
        testers.add(new User("King", "Arthur", "email@wp.pl", 63, true, Gender.MAN));
        testers.add(new User("Bella", "Beauty", "email@wp.pl", 83, true, Gender.WOMAN));
        testers.add(new User("Buzz", "Astral", "email@wp.pl", 93, true, Gender.MAN));
        testers.add(new User("Pocahontas", "Smith", "email@wp.pl", 43, true, Gender.WOMAN));
        testers.add(new User("Jane", "Porter", "email@wp.pl", 53, true, Gender.WOMAN));


        // Homework10 - 5. only filtered users

        List<User> womanTesters = testers.stream()
                .filter(woman -> woman.getGender().getGender().equals("F"))
                .collect(Collectors.toList());

        for (User woman : womanTesters) {
            System.out.println(woman.getFirstName() + " " + woman.getLastName()
                    + " " + woman.getEmail() + " " + woman.getAge() + " " + woman.getGender());
        }

        // Homework10/EXCEPTIONS - file 'names.txt' is created
        // Buffered is commented, because in every running the file is overwrite

        String file = "names.txt";

        BufferedWriter names = new BufferedWriter(new FileWriter(file));

        // Homework10/EXCEPTIONS - file is converted to list

        BufferedReader in = null;
        List<String> checkedNames = new ArrayList<String>();

        try {
            in = new BufferedReader(new FileReader(file));
            String str;
            while ((str = in.readLine()) != null) {
                checkedNames.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }

        for (String checkedName : checkedNames) {
            System.out.println(checkedName);
        }

        // Homework10/EXCEPTIONS - check "Ariel" is exist - IllegalStateException

        checkedNames.stream()
                .filter(str -> str.equals("Ariel"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Cannot find any given names parameter"));

        // Homework10/EXCEPTIONS - myOwnException - IllegalPriorityException


        Bug buggy = new Bug(1, "desc", 3,
                new BugReporter("Test", "Test", "test@test.pl"));

        buggy.setId(-5);
        buggy.setDescription(" ");
        buggy.setPriority(-100);
    }
}

