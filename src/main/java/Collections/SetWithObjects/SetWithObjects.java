package Collections.SetWithObjects;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetWithObjects  {

    public static void main(String[] args) {

        Set<User> users = new HashSet<>();

        users.add(new User("Adam", "Pietruszka", "email@wp.pl", 19));
        users.add(new User("Roman", "Pietruszka", "email@wp.pl", 67));
        users.add(new User("Weronika", "Pietruszka", "email@wp.pl", 33));
        users.add(new User("Edward", "Pietruszka", "email@wp.pl", 45));
        users.add(new User("Adam", "Pietruszka", "email@wp.pl", 19));
        users.add(new User("Adam", "Pietruszka", "email@wp.pl", 19));
        users.add(new User("Adam", "Pietruszka", "email@wp.pl", 19));
        users.add(new User("Adam", "Pietruszka", "email@wp.pl", 19));
        users.add(new User("Adam", "Pietruszka", "email@wp.pl", 19));


        System.out.println(users.size());

        for (User user: users
             ) {
            System.out.println(user.getFirstName() + " " + user.getLastName());

        }

        Set<User> sortedSet = new TreeSet(users);

        for (User user : users
        ) {
            System.out.println(user.getFirstName() + " " + user.getLastName());

        }
    }

}
