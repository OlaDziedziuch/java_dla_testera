package Homework4.displayingEvenNumbers;

public class displayQuantityOfEvenNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 6, 8, 2, 8, 9, 3, 0, 4, 8, 9, 0, 335, 6, 888, 953, 73, 90};

        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Quantity of even numbers is: " + even);
        System.out.println("Quantity of odd numbers is: " + odd);
    }


}
