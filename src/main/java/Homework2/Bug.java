package Homework2;

public class Bug {

    String description;
    String email;
    int priority; // 1,2,3,4,5
    boolean status; // true - opened || false - closed

    Bug(String description, String email) {

        this.description = description;
        this.email = email;
        this.priority = priority;
        this.status = getStatus();
    }

    boolean getStatus() {
        return true;
    }

    void changeStatus() {
        this.status = false;
        System.out.println("The status has been changed. Actual status is closed.");
    }

    void displayAllInfo() {
        System.out.println("Description: " + description + "\n" +
                "Applicant's e-mail: " + email + "\n" +
                "Priority: " + priority + "\n" +
                "Is the status open? - " + status + "\n");

    }

    void displayApplicant(String firstName, String lastName) {
        System.out.println("The person reporting the defect: " + firstName + " " + lastName);
    }

    int setPriority(int priority) {
        this.priority = priority;
        return priority;
    }
}

