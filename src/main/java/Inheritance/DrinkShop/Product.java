package Inheritance.DrinkShop;

public class Product {

    protected int quantity;
    protected int weight;
    protected int addNote;
    protected String addComment;
    protected boolean isAddedToCart;

    public Product(int quantity, int weight, int addNote, String addComment, boolean isAddingToCart) {
        this.quantity = quantity;
        this.weight = weight;
        this.addNote = addNote;
        this.addComment = addComment;
        this.isAddedToCart = false;
    }

    public int getQuantity() {
        return quantity;
    }

    public int setQuantity(int quantity) {
        if (quantity > 0 && quantity <= 100) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Oooops! Wrong value!");
        }
        return quantity;
    }

    public int getWeight() {
        return weight;
    }

    public int setWeight(int weight) {

        if ((weight == 50) || (weight == 250) || (weight == 1000)) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Oooops! Wrong value!");
        }
        return weight;
    }

    public int getAddNote() {
        return addNote;
    }

    public int setAddNote(int addNote) throws InstantiationException {
        if (addNote > 0 && addNote <= 5) {
            this.addNote = addNote;
        }
        else {
            throw new InstantiationException("Oooops! Wrong value!");
        }

        return addNote;
    }

    public String getAddComment() {
        return addComment;
    }

    public String setAddComment(String addComment) {
        if (addComment.length() > 100) {
            throw new IllegalArgumentException("Your opinion is too long");
        } else {
        this.addComment = addComment;
        }
        return addComment;
    }

    public void addedToCart() { isAddedToCart = true; }

    public boolean isAddedToCart() { return isAddedToCart; }

}



