package Homework4.changingFirstAndLastOnString;

public class fruits_withOneVar {

    public static void main(String[] args) {

        String[] fruits = {"peach", "pear", "pomelo", "apple", "dragon fruit"};

        String var = fruits[0];
        fruits[0] = fruits[fruits.length - 1];
        fruits[fruits.length - 1] = var;

        for (String newFruits : fruits
        ) {
            System.out.println(newFruits);

        }
    }
}
