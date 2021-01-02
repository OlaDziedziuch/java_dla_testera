package CollectionsUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Adam", "Pietruszka", "email@wp.pl", 19));
        users.add(new User("Roman", "Pietruszka", "email@wp.pl", 67));
        users.add(new User("Weronika", "Pietruszka", "email@wp.pl", 33));
        users.add(new User("Edward", "Pietruszka", "email@wp.pl", 45));


        Collections.sort(users, Comparator.comparingInt(User::getUserAge).reversed());

        for (User user : users) {
            System.out.println(user.getUserAge());
        }
    }
}
