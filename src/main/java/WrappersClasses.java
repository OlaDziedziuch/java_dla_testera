import java.util.ArrayList;
import java.util.List;

public class WrappersClasses {

    public static void main(String[] args) {

        Byte bt;
        Short st;
        Integer in;
        Long lo;
        Float fl;
        Double db;
        Character cha;
        Boolean bl;

        Integer intNumber = 10;
        System.out.println(intNumber);

        int newNumber = intNumber.intValue();

        Double newDouble = Double.valueOf(9.87);
        System.out.println(newDouble);

        //List<Integer> number = new ArrayList<>();
    }
}
