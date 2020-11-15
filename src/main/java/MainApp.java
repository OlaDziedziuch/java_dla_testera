public class MainApp {

    public static void main(String[] args) {

        User john = new User();
        john.firstName = "John";
        john.lastName = "Kowalsky";
        john.email = "john@02.pl";
        john.age = 17;
        john.isAdult = false;
        System.out.println(john.firstName);
        john.getFullName();
        john.displayUser();

        User peter = new User();
        peter.firstName = "Peter";
        peter.lastName = "Pets";
        peter.email = "pet@02.pl";
        peter.age = 33;
        peter.isAdult = true;
        System.out.println(peter.email);
        peter.getFullName();
        peter.displayUser();

    }
}
