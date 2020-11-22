package Array_ex3;

public class Array_ex3 {

    public static void main(String[] args) {

        int[] numbers = {1,3,2,6,2,7,9,3,5,4,64,7,8};

        // dwie pętle - pierwsza bierze liczbę, a druga porównuje ze sobą

        int min;

        for (int i = 0; i <numbers.length; i++) {
            min = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j]< min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;

                }
            }
        }

        for (int newNumber: numbers
        ) {
            System.out.println(newNumber);

        }


    }
}
