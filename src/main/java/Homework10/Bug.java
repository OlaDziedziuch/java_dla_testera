package Homework10;

import Homework8.BugReporter;
import Homework8.ConsoleNotification;
import Homework8.EmailNotification;
import MyOwnExceptions.IllegalDescriptionException;
import MyOwnExceptions.IllegalIdException;
import MyOwnExceptions.IllegalPriorityException;
import java.util.Objects;

public class Bug implements ConsoleNotification, EmailNotification, Comparable<Bug> {

    private int id;
    private String description;
    private int priority;
    private boolean status;
    private BugReporter bugReporter;

    public Bug(int id, String description, int priority, BugReporter bugReporter) {

        this.id = id;
        this.description = description;
        this.priority = priority;
        this.status = true;
        this.bugReporter = bugReporter;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) throws IllegalIdException {
        if (id <= 0) {
            throw new IllegalIdException("Id value is incorrect");
        } else {
            this.id = id;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws IllegalDescriptionException {
        if (description.length() < 10) {
            throw new IllegalDescriptionException("Description must contain at least 10 characters.");
        } else {
            this.description = description;
        }
    }

    public int getPriority() {
        return priority;
    }

    public int setPriority(int priority) throws IllegalPriorityException {

        if ((priority > 0) && (priority <= 5)) {
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

        } else {
            throw new IllegalPriorityException("The priority should be selected between 1-5.");

        }
        return priority;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        notifyStatusChange();
        sendEmailAfterStatusChange();
        this.status = status;
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public void displayAllInfo() {
        System.out.println("Description: " + description + "\n" +
                "Bug Reporter: " + bugReporter.toString() +
                "Is the status open? - " + status + "\n");

    }

    public void notifyStatusChange() {
        System.out.println("Status has been changed");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "id='" + id + " " +
                "description='" + description + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                ", BugReporter=" + bugReporter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return id == bug.id && priority == bug.priority && status == bug.status && Objects.equals(description, bug.description) && Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, priority, status, bugReporter);
    }

    @Override
    public void sendEmailAfterStatusChange() {
        System.out.println("Status has been changed");
    }

    @Override
    public int compareTo(Bug bug) {
        return this.getDescription().compareTo(bug.getDescription());
    }

}

