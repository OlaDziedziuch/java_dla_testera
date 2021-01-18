package Optional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Adam", "Aietruszka", "email@wp.pl", 19));
        users.add(new User("Roman", "Bietruszka", "email@wp.pl", 67));
        users.add(new User("Weronika", "Fietruszka", "email@wp.pl", 33));
        users.add(new User("Edward", "Gietruszka", "email@wp.pl", 45));
        users.add(new User("Adam", "Dietruszka", "email@wp.pl", 19));
        users.add(new User("Adam", "Fietruszka", "email@wp.pl", 19));
        users.add(new User("Adam", "Lietruszka", "email@wp.pl", 19));


        // max - comparator

        Optional<User> max = users.stream()
                .max(Comparator.comparingInt(User::getAge));

        // findFirst && orElse
        String pietruszka = users.stream()
                .map(User::getLastName)
                .filter(str -> str.equals("Pietruszka"))
                .findFirst()
                .orElse("Pietruszka is not exist");

        System.out.println(pietruszka);

        // max && orElse

        int age = users.stream()
                .map(User::getAge)
                .max(Integer::compareTo)
                .orElse(-1);

        System.out.println(age);
        System.out.println(max);

        // isPresent && ifEmpty

        if (((Optional<?>) max).isPresent()) {
            System.out.println(max.get());
        } else {
            System.out.println("Bad Value");
        }

        if (max.isEmpty()) {
            System.out.println(max.isEmpty());
        } else {
            System.out.println("Optional is not empty");
        }

        // orElseGet

        User aUser = users.stream()
                .filter(user -> user.getFirstName().startsWith("L"))
                .findFirst()
                .orElseGet(() -> new User("Artek", "Testowy", "e-mail@wp.pl", 20));

        System.out.println(aUser);

        // orElseThrow

        User allElseUser = users.stream()
                .filter(user -> user.getFirstName().startsWith("L"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("This user is not exist"));

        System.out.println(allElseUser);

        // ifPresent && ifPresentOrElse

        users.stream()
                .filter(user -> user.getFirstName().startsWith("R"))
                .findFirst()
                .ifPresent(user -> System.out.println(user));

        users.stream()
                .filter(user -> user.getFirstName().startsWith("M"))
                .findFirst()
                .ifPresentOrElse(user -> System.out.println(user), () -> System.out.println("User is not exist"));


    }
}

