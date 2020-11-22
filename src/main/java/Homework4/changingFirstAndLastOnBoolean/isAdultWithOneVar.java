package Homework4.changingFirstAndLastOnBoolean;

public class isAdultWithOneVar {
    public static void main(String[] args) {

        Boolean[] isAdult = {true, true, true, true, true, false, false, false, false};

        boolean temporary = isAdult[0];
        isAdult[0] = isAdult[isAdult.length - 1];
        isAdult[isAdult.length - 1] = temporary;

        for (boolean newIsAdult : isAdult
        ) {
            System.out.println(newIsAdult);

        }
    }
}
