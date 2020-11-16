public class MainApp {

    public static void main(String[] args) {

        User john = new User("John", "Kowalsky", "john@o2.pl", 17);
        john.displayUser();

        // method overloading
        john.greetings(john.firstName, john.lastName);
        john.greetings("Johnny");

        User jenny = new User("Jenny","Comand","com@wp.pl",55);
        jenny.displayUser();

        User peter = new User("Peter", "Pets", "pet@o2.pl", 33);
        peter.displayUser();

    }
}
