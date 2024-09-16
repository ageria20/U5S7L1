package ageria.u5s7l1.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super("Element with id: " + id + " NOT FOUND");
    }

    public NotFoundException(String msg) {
        super(msg);
    }
}
