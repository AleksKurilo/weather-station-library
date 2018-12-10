package exception;

public class NotUniqueException extends BaseException {

    private final static String MESSAGE = "Field '%s' not unique!";
    private final String fieldName;

    public NotUniqueException(String fieldName) {
        super(String.format(MESSAGE, fieldName));
        this.fieldName = fieldName;
    }
}
