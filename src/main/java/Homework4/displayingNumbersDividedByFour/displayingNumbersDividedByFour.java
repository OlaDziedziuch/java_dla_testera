package Homework4.displayingNumbersDividedByFour;

public class displayingNumbersDividedByFour {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 6, 8, 2, 8, 9, 3, 0, 4, 8, 9, 0, 335, 6, 888, 953, 73, 90};

        int divBy4 = 0;
        int notDivBy4 = 0;

        for (int number : numbers
        ) {
            if ((number % 4 == 0)  && !(number == 0)) {
                divBy4++;

            } else {
                notDivBy4++;
            }
        }

        System.out.println("Quantity numbers divided by 4: " + divBy4);
        System.out.println("Quantity numbers not divided by 4: " + notDivBy4);
    }
}
