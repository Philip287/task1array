package by.suprun.task1.exception;

public class CustomArrayException extends Exception {

    public CustomArrayException() {
        super();
    }

    public CustomArrayException(String message) {
        super(message);
    }

    public CustomArrayException(Exception exception) {
        super(exception);
    }

    public CustomArrayException(String message, Exception exception) {
        super(message, exception);
    }
}
