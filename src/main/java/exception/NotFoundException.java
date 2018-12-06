package exception;

public class NotFoundException extends BaseException {

    private final static String MESSAGE = "'%s' with id '%s' not found!";

    private final long id;

    private final String className;

    public NotFoundException(long id, Class clazz) {
        super(String.format(MESSAGE, clazz.getSimpleName(), id));
        this.id = id;
        this.className = clazz.getSimpleName();
    }
}
