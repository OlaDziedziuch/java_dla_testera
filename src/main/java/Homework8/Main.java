package Homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        List<Bug> bugs = new ArrayList<>();

        bugs.add(new Bug(1, "Oooops.. I did it again... Some crash on website", 1, new BugReporter("Adam", "Pietruszka", "pietrek@wp.pl")));
        bugs.add(new Bug(2, "Typo in word 'cat'", 2, new BugReporter("Adam", "Pietruszka", "pietrek@wp.pl")));
        bugs.add(new Bug(3, "What? Incorrect value on product", 3, new BugReporter("Adam", "Pietruszka", "pietrek@wp.pl")));
        bugs.add(new Bug(4, "Someone in Paint did it? Low image quality", 4, new BugReporter("Adam", "Pietruszka", "pietrek@wp.pl")));
        bugs.add(new Bug(5, "I am afraid you can't go here. Inactive link", 5, new BugReporter("Jack", "Kowalsky", "koval@test.pl")));
        bugs.add(new Bug(6, "404 - you shall not pass..", 1, new BugReporter("Jack", "Kowalsky", "koval@test.pl")));
        bugs.add(new Bug(1, "Oooops.. I did it again... Some crash on website", 1, new BugReporter("Jack", "Kowalsky", "koval@test.pl")));
        bugs.add(new Bug(7, "Guess man? My fav settings are not working", 1, new BugReporter("Jack", "Kowalsky", "koval@test.pl")));
        bugs.add(new Bug(8, "Great, our MVP product has bad value", 1, new BugReporter("Jack", "Kowalsky", "koval@test.pl")));
        bugs.add(new Bug(9, "Zoom zoom zoom", 1, new BugReporter("Jack", "Kowalsky", "koval@test.pl")));
        bugs.add(new Bug(10, "&& - that could be interesting...", 1, new BugReporter("Jack", "Kowalsky", "koval@test.pl")));
        bugs.add(new Bug(10, "-1 - ohh, that too...", 1, new BugReporter("Jack", "Kowalsky", "koval@test.pl")));

        System.out.println("All bugs: " + "\n");

        for (Bug allBug : bugs
        ) {
            System.out.println(allBug.getDescription());
        }

        System.out.println("\n" + "Unique bugs in alphabetical order:  ");

        Set<Bug> onlyUniqueBug = new TreeSet<>(bugs);

        for (Bug uniqueBug : onlyUniqueBug
        ) {
            System.out.println(uniqueBug.getDescription());
        }

    }
}

