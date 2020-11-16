public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;


    User(String firstName, String lastName, String email, int age) {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " "+ isAdult);

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }


    void getName() {
        System.out.println(firstName + lastName);
    }

    void getName(String firstName) {
        System.out.println(firstName);
    }

    void displayUser() {
        System.out.println("First name: " + firstName + "\n"
                + "Last name: " + lastName + "\n"
                + "E-mail: " + email + "\n"
                + "Age: " + age + "\n"
                + "Adult: " + isAdult + "\n");
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greeting(String name) {
        System.out.println("Hello " + name + "! Nice to see you!");
    }

    void greeting(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " "+ lastName + "! Nice to see you!");
    }

    int yourAgePlusTen(int age) {
        return age + 10;
    }

}
