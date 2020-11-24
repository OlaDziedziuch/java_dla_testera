package StaticMethods;

public class StaticMethods {

    public static void main(String[] args) {

        System.out.println(StringUtils.getFormattedText("This picture shows something."));
        System.out.println(StringUtils.getFormattedText("This pic."));


       /* StringUtils stringUtils = new StringUtils();

        System.out.println(stringUtils.getFormattedText("This picture shows something."));
        System.out.println(stringUtils.getFormattedText("This pic."));
*/

        System.out.println(WeekUtils.MONDAY);
        System.out.println(WeekUtils.THURSDAY);
        // unplanned overwriting
        // System.out.println(WeekUtils.monday = "Sunday");
        // now its not possible
        // System.out.println(WeekUtils.MONDAY = "Sunday");

        System.out.println(WeekUtils.SUNDAY);
        System.out.println(WeekUtils.SUNDAY = "The new Monday");




    }
}
