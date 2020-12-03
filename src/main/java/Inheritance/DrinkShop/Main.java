package Inheritance.DrinkShop;

import Homework6.PC;

public class Main {

    public static void main(String[] args) {

        Product Audun = new Coffee(6,50,1,"Comment is here","dark",
                "aeropress");

        Product Earl = new Tea (1,100,2, "zyq", "Black", 99);

        System.out.println(Audun.getQuantity());
        System.out.println(Audun.setQuantity(230));
        System.out.println(Audun.setQuantity(250));
        System.out.println(Audun.quantity);

        System.out.println(Audun.getQuantity());
        System.out.println(Audun.setQuantity(20));
       System.out.println(Earl.weight);
        System.out.println(Audun.setWeight(50));
        System.out.println(Audun.setWeight(250));
        System.out.println(Audun.setWeight(1000));

        System.out.println(((Coffee)Audun).getTypeOfRoast());
        System.out.println(((Coffee)Audun).setTypeOfRoast("taptap"));

        System.out.println(Earl.getWeight());
        System.out.println(Earl.setWeight(250));

        System.out.println(((Tea)Earl).getTypeOfTea());
        System.out.println(((Tea)Earl).setTypeOfTea("Green"));

        System.out.println(((Tea)Earl).getTempBoiling());
        System.out.println(((Tea)Earl).setTempBoiling("Green"));

    }
}
