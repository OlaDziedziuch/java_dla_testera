package Inheritance.DrinkShop;

public class Accessories extends Product {

    private String typeOfTea; //black/green/white/red
    private int tempBoiling;

    public Accessories(int quantity, int weight, int addNote, String addComment, boolean isAddingToCart) {
        super (quantity, weight, addNote, addComment, isAddingToCart);

    }
}