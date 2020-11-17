package Homework2;

public class Bug {

    String description;
    String email;
    int priority; // 1,2,3,4,5
    boolean status; // true - opened || false - closed
    String firstName;
    String lastName;

    Bug(String description, String email, int priority, String firstName, String lastName) {

        this.description = description;
        this.email = email;
        this.priority = priority;
        this.status = getStatus();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void displayAllInfo() {
        System.out.println("Description: " + description + "\n" +
                "Applicant: " + firstName + " " + lastName + "\n" +
                "Applicant's e-mail: " + email + "\n" +
                "Is the status open? - " + status + "\n");

    }

    // getters

    boolean getStatus() {
        return true;
    }

    // setters

    void setStatus() {
        this.status = false;
        System.out.println("The status has been changed. Actual status is closed.");
    }

    int setPriority(int priority) {
        this.priority = priority;

        switch (priority) {
            case 2:
                System.out.println("The priority is: 2");
                break;
            case 3:
                System.out.println("The priority is: 3");
                break;
            case 4:
                System.out.println("The priority is: 4");
                break;
            case 5:
                System.out.println("The priority is: 5");
                break;
            default:
                System.out.println("The priority is: 1");
        }
        return priority;
    }

    void setApplicant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void setMailApplicant(String email) {
        this.email = email;
    }


}

