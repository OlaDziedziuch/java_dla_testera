package Factorial;

public class Factorial {

    public int countFactorial(int number) {

        int result = 1;

        for (int i = result; i <= number; i++) {
            result = result * i;
        }

        return result;
    }

    private int findFactorial(int number) {
        int result = 1;
        int i = 2;

        while (number >= i) {
            result = result * i;
            i++;
        }
        return result;
    }
}
