package Inheritance.DrinkShop;

public class Tea extends Product {

    private String typeOfTea;
    private int tempBoiling;

    public Tea(int quantity, int weight, int addNote, String addComment, String typeOfTea,
               int tempBoiling) {
        super(quantity, weight, addNote, addComment);
        this.typeOfTea = typeOfTea;
        this.tempBoiling = tempBoiling;
    }

    public int setWeight(int weight) {

        if ((weight == 50) || (weight == 100) || (weight == 250) || (weight == 1000)) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Oooops! Wrong value!");
        }
        return weight;
    }

    public String getTypeOfTea() {
        return typeOfTea;
    }

    public String setTypeOfTea(String typeOfTea) {
        switch (typeOfTea) {
            case "Black":
            case "Green":
            case "White":
            case "Yellow":
            case "Oolong":
            case "Herbal":
                this.typeOfTea = typeOfTea;
                break;
            default:
                System.out.println("Incorrect type of tea.");
        }
        return typeOfTea;
    }

    public int getTempBoiling() {
        return tempBoiling;
    }

    public String setTempBoiling(String typeOfTea) {

        String text = "You should brew your tea at ";
        char degree = '\u2103';

        if ((typeOfTea == "Black") || (typeOfTea == "Herbal")) {
            System.out.println(text + 99 + degree);
        } else if (typeOfTea == "Green") {
            System.out.println(text + 75 + "-" + 80 + degree);
        } else if (typeOfTea == "White") {
            System.out.println(text + 65 + "-" + 70 + degree);
        } else if (typeOfTea == "Yellow") {
            System.out.println(text + 70 + "-" + 75 + degree);
        } else if (typeOfTea == "Oolong") {
            System.out.println(text + 80 + "-" + 85 + degree);
        } else {
            System.out.println("Enter correct type of tea.");
        }

        return typeOfTea;
    }

}
