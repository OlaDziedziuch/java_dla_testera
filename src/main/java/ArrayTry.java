public class ArrayTry {


    public static void main(String[] args) {

        int[] values = {1, 42, 6, 7, 9, 4, 7};

        int min;

        // taking index0 and comparing with another indexes (1,2,3 etc)
        for (int i = 0; i < values.length; i++) {
            min = values[i];
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < min) {
                    min = values[j];
                    values[j] = values[i];
                    values[i] = min;
                }
            }
        }

        for (int newValue : values
        ) {
            System.out.println(newValue);

        }

    }
}
