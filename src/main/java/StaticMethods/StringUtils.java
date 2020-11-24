package StaticMethods;

public class StringUtils {

    public static String getFormattedText(String description) {

        if (description.length() < 10) {
            return description;
        } else {
            return description.substring(0, 7) + "...";
        }
    }


}
