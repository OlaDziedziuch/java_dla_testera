package Homework4.changingFirstAndLastOnBoolean;

public class isAdultWithTwoVar {

    public static void main(String[] args) {

        Boolean[] isAdult = {true,true,true,true,true, false, false, false, false};

        boolean first = isAdult[0];
        boolean last = isAdult[isAdult.length-1];

        isAdult[0] = last;
        isAdult[isAdult.length-1] = first;

        for (boolean newIsAdult: isAdult
             ) {
            System.out.println(newIsAdult);

        }
    }
}
