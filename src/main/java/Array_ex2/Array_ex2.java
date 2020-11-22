package Array_ex2;

public class Array_ex2 {

    public static void main(String[] args) {

        int[] numbers = {3, 56, 7, 8, 3, 78, 2, 5, 9, 2};

        int even = 0;
        int odd = 0;

        //1. Foreach

        for (int newNumbers : numbers
        ) {
            if (newNumbers % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);


        int[] trees = {3, 47, 8, 9, 2, 7, 2, 7, 3, 6, 3, 9, 6, 4, 2, 4, 67, 7};

        int even1 = 0;
        int odd1 = 0;

        for (int newTrees : trees
        ) {
            if (newTrees % 2 == 0) {
                even1++;
            } else {
                odd1++;
            }
        }

        System.out.println("Even numbers: " + even1);
        System.out.println("Odd numbers: " + odd1);
    }
}
