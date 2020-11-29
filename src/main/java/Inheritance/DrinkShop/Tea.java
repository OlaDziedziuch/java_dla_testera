package Inheritance.DrinkShop;

public class Tea extends Product {

    private String typeOfTea; //black/green/white/red
    private int tempBoiling;

    public Tea (int quantity, int weight, int addNote, String addComment, boolean isAddingToCart, String typeOfTea,
                int tempBoiling) {
        super (quantity, weight, addNote, addComment, isAddingToCart);
        this.typeOfTea = typeOfTea;
        this.tempBoiling = tempBoiling;

    }
}
