package Homework4.Sort;

public class SortDesc {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 6, 8, 2, 8, 9, 3, 0, 4, 8, 9, 0, 15, 6, 18, 9, 14, 0};

        int max;

        for (int i = 0; i < numbers.length; i++) {
            max = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }

        for (int number : numbers
        ) {
            System.out.println(number);
        }
    }
}
