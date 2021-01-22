package MyOwnExceptions;

public class IllegalPriorityException extends RuntimeException{

    public IllegalPriorityException() {
    }

    public IllegalPriorityException(String message) {
        super(message);
    }


}
