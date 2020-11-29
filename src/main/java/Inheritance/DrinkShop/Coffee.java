package Inheritance.DrinkShop;

public class Coffee extends Product {

    private String typeOfRoast;
    private String typeOfBrewing;

    public Coffee (int quantity, int weight, int addNote, String addComment, boolean isAddingToCart, String typeOfRoast,
                   String typeOfBrewing) {
        super (quantity, weight, addNote, addComment, isAddingToCart);
        this.typeOfRoast = typeOfRoast;
        this.typeOfBrewing = typeOfBrewing;

    }

}

