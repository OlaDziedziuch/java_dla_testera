package Optional;

import Collections.SetWithObjects.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class SortedStream {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Adam", "Aietruszka", "email@wp.pl", 19));
        users.add(new User("Roman", "Bietruszka", "email@wp.pl", 67));
        users.add(new User("Weronika", "Fietruszka", "email@wp.pl", 33));
        users.add(new User("Edward", "Gietruszka", "email@wp.pl", 45));
        users.add(new User("Adam", "Dietruszka", "email@wp.pl", 19));
        users.add(new User("Adam", "Fietruszka", "email@wp.pl", 19));
        users.add(new User("Adam", "Lietruszka", "email@wp.pl", 19));
        users.add(new User("Adam", "Sietruszka", "email@wp.pl", 19));
        users.add(new User("Adam", "Rietruszka", "email@wp.pl", 19));

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getLastName).thenComparing(User::getLastName))
                .collect(Collectors.toList());

        for (User user : sortedUsers
             ) {
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }
    }
}
