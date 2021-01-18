package Factorial;

public class App {

    public static void main(String[] args) {

        Factorial fact = new Factorial();

        int factorial = fact.countFactorial(4);
        int factorial1 = fact.countFactorial(5);
        int factorial2 = fact.countFactorial(6);

        System.out.println(factorial);
        System.out.println(factorial1);
        System.out.println(factorial2);
    }
}
