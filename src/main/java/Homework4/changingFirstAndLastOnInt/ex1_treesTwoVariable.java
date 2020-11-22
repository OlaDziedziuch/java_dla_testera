package Homework4.changingFirstAndLastOnInt;

public class ex1_treesTwoVariable {

    public static void main(String[] args) {
        int[] trees = {4, 8, 2, 6, 3, 5, 9, 9};

        int tempFirst = trees[0];
        int tempLast = trees[trees.length - 1];

        trees[0] = tempLast;
        trees[trees.length - 1] = tempFirst;

        for (int newTrees : trees
        ) {
            System.out.println(newTrees);
        }

    }
}
