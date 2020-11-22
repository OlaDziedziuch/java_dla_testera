package Homework4.displayingNumbersDividedByFive;

public class displayingNumbersDividedByFive {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 6, 8, 2, 8, 9, 3, 0, 4, 8, 9, 0, 335, 6, 888, 953, 73, 90};

        int divBy5 = 0;
        int notDivBy5 = 0;

        for (int number : numbers
        ) {
            if ((number % 5 == 0) && !(number == 0)) {
                divBy5 += 1;
            } else {
                notDivBy5 += 1;
            }
        }
        System.out.println("Quantity of numbers divided by 5: " + divBy5);
        System.out.println("Quantity of numbers not divided by 5: " + notDivBy5);
    }
}
