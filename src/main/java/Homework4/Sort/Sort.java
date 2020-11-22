package Homework4.Sort;

public class Sort {


    public static void main(String[] args) {

        int[] numbers = {1, 4, 6, 8, 2, 8, 9, 3, 0, 4, 8, 9, 0, 335, 6, 888, 953, 73, 90};

        int min;

        //
        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] < min) {
                        min = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = min;
                    }
                }
            }
        }

        for (int number : numbers
        ) {
            System.out.println(number);
        }

    }

}
