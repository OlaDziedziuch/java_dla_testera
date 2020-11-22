package Homework4.changingFirstAndLastOnInt;

public class ex1_treesWithNoVariables {

    public static void main(String[] args) {
        int[] trees = {4, 8, 2, 6, 3, 5, 9, 9};


        trees[trees.length - 1] = trees[trees.length - 1] + trees[0];
        trees[0] = trees[trees.length - 1] - trees[0];
        trees[trees.length - 1] = trees[trees.length - 1] - trees[0];

        for (int reverseNewTrees : trees
        ) {
            System.out.println(reverseNewTrees);
        }

    }
}
