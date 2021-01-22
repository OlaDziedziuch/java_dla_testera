package Homework10;

import Enums.Gender;

public class User {

    private static int userCounter = 0;

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;
    Gender gender;

    public static int getUserCounter() {
        return userCounter;
    }

    // Homework10 - 3. created new constructor with gender's enum

    public User(String firstName, String lastName, String email, int age, boolean isAdult, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isAdult;
        this.gender = gender;
        userCounter++;
    }

    // Homework10 - 2. setters and getters for gender's enum

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static void setUserCounter(int userCounter) {
        User.userCounter = userCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }


    void getName() {
        System.out.println(firstName + lastName);
    }

    void getName(String firstName) {
        System.out.println(firstName);
    }

    void displayUser() {
        System.out.println("First name: " + firstName + "\n"
                + "Last name: " + lastName + "\n"
                + "E-mail: " + email + "\n"
                + "Age: " + age + "\n"
                + "Adult: " + isAdult + "\n");
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greeting(String name) {
        System.out.println("Hello " + name + "! Nice to see you!");
    }

    void greeting(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName + "! Nice to see you!");
    }

    int yourAgePlusTen(int age) {
        return age + 10;
    }

}
