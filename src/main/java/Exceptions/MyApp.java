package Exceptions;

import Homework8.BugReporter;



public class MyApp {

    public static void main(String[] args)  {

        /*System.out.println(WeekDays.MONDAY.getName());

        if ("monday".equalsIgnoreCase(WeekDays.MONDAY.getName())) {
            System.out.println("It's ok");
        } else {
            System.out.println("It's not ok");
        }*/

        /*InputStream in;
        File file;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/test.txt"));

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("No matter - try or catch - i will always display");
        }
*/

        /*File file;
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String line = br.readLine();

        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }*/
/*
//null pointer exception
        Bug bug = new Bug(1,"Desc", 4, new BugReporter("Adam", "Adamsky",
                "adam@wp.pl"));

        System.out.println(bug.getDescription());

        bug = null;
        System.out.println(bug.getDescription());
*/

      /*  //IndexOutOfBoundException
        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Jill");

        System.out.println(names.get(3));*/

        //

       /* //IllegalStateException
        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Jill");
        names.add("Jill");
        names.add("Jill");

        names.stream()
                .filter(str -> str.startsWith("G"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Cannot find any given names parameter"));

        System.out.println(names.get(3));*/

        // IllegalArgumentException

        BugReporter tester1  = new BugReporter("Jack", "Jackowski", "jack@wp.pl");

        tester1.setEmail("test.wp.pl");
    }
}
