package Inheritance.DrinkShop;

public class Main {

    public static void main(String[] args) {

        Coffee Audun = new Coffee(6,50,1,"Comment is here","dark",
                "aeropress");

        Tea Earl = new Tea (1,100,2, "zyq", "string", 99);

        //System.out.println(Audun.getQuantity());
        //System.out.println(Audun.setQuantity(230));
        //System.out.println(Audun.setQuantity(250));
        ///System.out.println(Audun.quantity);

        //System.out.println(Audun.getQuantity());
        //System.out.println(Audun.setQuantity(20));
       /* System.out.println(Earl.weight);
        System.out.println(Audun.setWeight(50));
        System.out.println(Audun.setWeight(250));
        System.out.println(Audun.setWeight(1000));*/

        System.out.println(Audun.getTypeOfRoast());
        System.out.println(Audun.setTypeOfRoast("taptap"));


    }
}
