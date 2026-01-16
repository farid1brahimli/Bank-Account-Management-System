package exceptions;

public class InsufficientBalancedException extends Exception {
    public InsufficientBalancedException(String message) {
        super(message);
    }
}
