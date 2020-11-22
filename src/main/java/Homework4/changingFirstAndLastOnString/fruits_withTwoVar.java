package Homework4.changingFirstAndLastOnString;

public class fruits_withTwoVar {

    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "mango", "mulberry", "kiwi"};

        String var1 = fruits[0];
        String var2 = fruits[fruits.length - 1];

        fruits[0] = var2;
        fruits[fruits.length-1] = var1;

        for (String newFruits: fruits
             ) {
            System.out.println(newFruits);

        }
    }
}
