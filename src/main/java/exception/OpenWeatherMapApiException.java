package exception;

public class OpenWeatherMapApiException extends RuntimeException {

    private final static String MESSAGE = "Opent Weather Api exception! Response status code: '%s' ";
    private final int statusCode;

    public OpenWeatherMapApiException(int statusCode) {
        super((String.format(MESSAGE, statusCode)));
        this.statusCode = statusCode;
    }
}
