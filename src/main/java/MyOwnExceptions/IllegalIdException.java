package MyOwnExceptions;

public class IllegalIdException extends RuntimeException{

    public IllegalIdException() {
    }

    public IllegalIdException(String message) {
        super(message);
    }
}
