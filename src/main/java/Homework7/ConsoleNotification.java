package Homework7;

public interface ConsoleNotification {

   default void notifyStatusChange() {
        System.out.println("Lorem Ipsum...");
    }
}
