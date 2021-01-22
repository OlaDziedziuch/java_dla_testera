package MyOwnExceptions;

public class IllegalDescriptionException extends RuntimeException{

    public IllegalDescriptionException() {
    }

    public IllegalDescriptionException(String message) {
        super(message);
    }
}
