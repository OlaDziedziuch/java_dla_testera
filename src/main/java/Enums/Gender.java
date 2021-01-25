package Enums;

public enum Gender {

    //Homework10 -  1. new enum is created

    MAN("M"), WOMAN("F");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
