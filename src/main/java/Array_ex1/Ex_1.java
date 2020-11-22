package Array_ex1;

public class Ex_1 {

    public static void main(String[] args) {

        int[] trees = {1, 2, 3, 4, 5};

        // add to the last element the first one

        trees[trees.length - 1] = trees[trees.length - 1] + trees[0];
        // substract first element = last - first

        trees[0] = trees[trees.length-1] - trees[0];
        // substract last element = last - first

        trees[trees.length-1] = trees[trees.length-1] - trees[0];

        for (int newTrees : trees
        ) {
            System.out.println(newTrees);
        }

        int[] numbers = {7,3,8,3,7,3,8,9,9,9,9,0};

        numbers[numbers.length-1] = numbers[numbers.length-1] + numbers[0];
        numbers[0] = numbers[numbers.length-1] - numbers[0];
        numbers[numbers.length-1] = numbers[numbers.length-1] - numbers[0];

        for (int newNum: numbers
             ) {
            System.out.println(newNum);

        }



        /*// 1. creating two temporary variables

        int temp1 = trees[0];
        int temp2 = trees[4];

        // changing places

        trees[0] = temp2;
        trees[4] = temp1;

        for (int newTrees: trees
             ) {
            System.out.println(newTrees);

        }


        String fruits[] = {"apple", "pear", "plum", "strawberry", "mullberry", "rapsberry"};

        int arrEl = fruits.length -1;
        System.out.println(arrEl);

        String temp11 = fruits[0];
        String temp22 = fruits[5];

        fruits[0] = temp22;
        fruits[5] = temp11;

        for (String newFruits: fruits
             ) {
            System.out.println(newFruits);

        }


        boolean isAdult[] = {true, true, true, false, false};

        int ArrEl = isAdult.length - 1;
        System.out.println(ArrEl);

        boolean tempisAd1 = isAdult[0];
        boolean tempisAd2 = isAdult[4];

        isAdult[0] = tempisAd2;
        isAdult[4] = tempisAd1;

        for (boolean isAdultChange: isAdult
             ) {
            System.out.println(isAdultChange);

        }

        // bartek's

        int[] num = {1,2,3,4,5};

        int first = num[0];
        int last = num[num.length - 1];

        num[0] = last;
        num[num.length-1] = first;

        for (int newNum: num
             ) {
            System.out.println(newNum);

        }

        }*/

            //2. creating one variable

        /*int first = trees[0]; // and get the index [0]
        trees[0] = trees[trees.length - 1]; // index[0] = the last elem of array

        trees[trees.length-1] = first; // the last el of array = variable

        for (int newTrees: trees
             ) {
            System.out.println(newTrees);

        }*/

            //3. no temp variables


        }
    }

