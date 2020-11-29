package Inheritance.DrinkShop;

public class Main {

    public static void main(String[] args) {

        Coffee Audun = new Coffee(6,50,1,"Comment is here","dark",
                "aeropress");

        //System.out.println(Audun.getQuantity());
        //System.out.println(Audun.setQuantity(230));
        //System.out.println(Audun.setQuantity(250));
        ///System.out.println(Audun.quantity);

        System.out.println(Audun.getQuantity());
        System.out.println(Audun.setQuantity(101));
        System.out.println(Audun.setAddComment("vfuvbfdbvuhdfbvufdabvukdfavbuvbshvfuallllllllll"));


    }
}
