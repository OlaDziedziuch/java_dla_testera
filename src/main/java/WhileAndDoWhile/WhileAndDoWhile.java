package WhileAndDoWhile;

public class WhileAndDoWhile {

    public static void main(String[] args) {

        int i = 10;
        int j = 20;
        int k = 30;

        /*
        // pętla nigdy się nie wykona, bo warunek jest false;
        while (i > 20) {
            System.out.println(i);
        }*/

        /*
        // pętla się zawiesza, bo warunek zawsze jest true;
        while (i < 20) {
            System.out.println(i);
        }*/


        while (i <= 20) {
            System.out.println(i);
            i++;

        }

        do {
            System.out.println("Hello J!");
            System.out.println(j);
            j++;
        }
        while (j < 30);

        do {
            System.out.println("Hello K!");
            System.out.println(k);
            k++;
        }
        while (k > 40);
    }
}
