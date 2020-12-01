package Inheritance.DrinkShop;

public class Coffee extends Product {

    private String typeOfRoast;
    private String typeOfBrewing;

    public Coffee(int quantity, int weight, int addNote, String addComment, String typeOfRoast,
                  String typeOfBrewing) {
        super(quantity, weight, addNote, addComment);
        this.typeOfRoast = typeOfRoast;
        this.typeOfBrewing = typeOfBrewing;
    }

    public int setQuantity(int quantity) {
        if (quantity > 0 && quantity <= 20) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Oooops! Wrong value!");
        }
        return quantity;
    }

    public String getTypeOfRoast() {
        return typeOfRoast;
    }

    public String setTypeOfRoast(String typeOfRoast) {

        if ((typeOfRoast == "light") || (typeOfRoast == "medium") || (typeOfRoast == "dark")) {
            this.typeOfRoast = typeOfRoast;
        } else {
            throw new IllegalArgumentException("Oooops! Wrong value!");
        }
        return typeOfRoast;
    }

    public String getTypeOfBrewing() {
        return typeOfBrewing;
    }

    public void setTypeOfBrewing(String typeOfBrewing) {
        switch (typeOfBrewing) {

            case "French press":
            case "Percolator":
            case "Single serve":
            case "Aeropress":
            case "Drip":
            case "Pour over":
            case "Cold brew":
            case "Moka":
                this.typeOfBrewing = typeOfBrewing;
                break;
            default:
                System.out.println("Incorrect type of brewing.");
        }
    }
}


