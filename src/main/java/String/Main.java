package String;

public class Main {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        //1. Equals - wywoływana na pierwszym obiekcie, jako parater podaję drugi

        // str1.equals(str2);
        boolean isEquals = str1.equals(str2);
        //lub
        System.out.println(str1.equals(str2));
        System.out.println(isEquals);

        //2. EqualsIgnoreCase - porównanie Stringów bez znaczenia jaką jest napisane literą

        boolean isEqualCase = str1.equalsIgnoreCase(str2);
        System.out.println(isEqualCase);

        // 3. ToUppercase - zamiana Stringa na wielkie litery

        String toUppercase = str1.toUpperCase();
        System.out.println(toUppercase);

        // 4. ToLowecase - zamiana stringa na małe litery

        String lowercase = str1.toLowerCase();
        System.out.println(lowercase);

        // 5. starts with - sprawdzenie czy string zaczyna sie od konkretnych liter

        boolean isStartsWithHe = str1.startsWith("He");
        System.out.println(isStartsWithHe);

        // 6. ends with - sprawdzenie czy się kończy z konkretnych liter

        boolean isEndsWithLol = str1.endsWith("lol");
        System.out.println(isEndsWithLol);

        // 7. contains - metoda sprawdzająca czy String zawiera jakiś tekst

        boolean isContainsWith = str1.contains("Lol");
        System.out.println(isContainsWith);

        // 8. is blank - sprawdza czy string jest pusty, ignorując spacje

        boolean isBlank = "   ".isBlank();

        // 9. is empty - sprawdza czy string jest pusty, ale tez wlicza spacje

        boolean isEmpty = "  ".isEmpty();

        System.out.println("Is blank " + isBlank);
        System.out.println("Is empty " + isEmpty);

        // 10. replace - zmiana ciagu znakow w stringu

        String replace = str1.replace("llo", "jka");
        System.out.println(replace);

        // 11. replace all - zamiana ciagu znakow w kilku miejsach

        String replaceAll = str2.replaceAll("l", "o");
        System.out.println(replaceAll);

        // 12. subtract - wydzielenie czesci stringa

        int str1Length = str1.length() - 1;
        System.out.println(str1Length);

        String substring = str1.substring(1, 4);
        System.out.println(str1 + substring);

        // 13. length - zwracanie iloci znakow w tym wliczają się białe znaki

        String text = "        some text    ";

        System.out.println((str1 + substring).length());
        System.out.println((text).length());

        // 14. strip - usuniecie wszystkich spacji przed i po tekscie

        String stripText = text.strip();
        System.out.println(stripText);
        System.out.println(stripText.length());


        String newText = "Once upon a time in a kingdom far far away...           ";
        String check = " ... there was a little wood. ";

        String concat = newText.concat(check);
        System.out.println(concat);

        boolean equals = newText.equals(check);
        System.out.println(equals);

        boolean equalsIgnoreCase = newText.equalsIgnoreCase(check);
        System.out.println(equalsIgnoreCase);

        String s = newText.toUpperCase();
        System.out.println(s);

        String s1 = check.toLowerCase();
        System.out.println(s1);

        boolean once = newText.startsWith("Once");
        System.out.println(once);

        boolean star = check.endsWith("star");
        System.out.println(star);

        boolean time = newText.contains("time");
        System.out.println(time);

        System.out.println(newText.isBlank());
        System.out.println(newText.isEmpty());

        System.out.println(newText.replace(".", "*"));
        System.out.println(newText.replaceAll("far", " "));

        System.out.println(check.length());
        System.out.println(check.substring(0,10));

        System.out.println(newText.length());
        System.out.println(check.length());

        System.out.println(newText.strip());
        System.out.println(check.strip());




    }
}
