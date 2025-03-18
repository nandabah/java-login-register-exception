package exception;

public class CustomCheckException extends RuntimeException {
    public CustomCheckException(String message) {
        super(message);
    }
}
