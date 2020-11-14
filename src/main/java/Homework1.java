public class Homework1 {

    public static void main(String[] args) {


        // initializing four variables with random values

        int a = 3;
        int b = 0;
        int c = 12;
        int d = 7;

        // checking the sum of the first and second variables

        int sum1 = a + b;
        if (sum1 % 2 == 0) {
            System.out.println("The sum of the first pair is an even number (" + sum1 + ").");
        }

        // checking the sum of the third and fourth variables

        int sum2 = c + d;
        if (sum2 % 2 == 0) {
            System.out.println("The sum of the second pair is an even number (" + sum2 + ").");
        }

        // displaying the results when the two sums are an even number

        int sum = sum1 + sum2;
        if (sum1 % 2 == 0 && sum2 % 2 == 0) {
            System.out.println("The sum of all variables is an even number (" + sum + ").");
        } else {
            System.out.println("The sum of all variables is not even number (" + sum + ").");
        }

    }
}

