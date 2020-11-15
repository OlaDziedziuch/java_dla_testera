public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    void getFullName() {
        System.out.println(firstName + lastName);
    }

    void displayUser() {
        System.out.println("First name: " + firstName + "\n"
                + "Last name: " + lastName  + "\n"
                + "E-mail: " + email + "\n"
                + "Age: " + age + "\n"
                + "Adult: " + isAdult + "\n");
    }

}
