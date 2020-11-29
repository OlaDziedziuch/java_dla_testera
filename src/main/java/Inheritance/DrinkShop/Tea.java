package Inheritance.DrinkShop;

public class Tea extends Product {

    private String typeOfTea; //black/green/white/red
    private int tempBoiling;

    public Tea (int quantity, int weight, int addNote, String addComment, String typeOfTea,
                int tempBoiling) {
        super (quantity, weight, addNote, addComment);
        this.typeOfTea = typeOfTea;
        this.tempBoiling = tempBoiling;

    }
}
