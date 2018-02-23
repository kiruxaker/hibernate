package hibernate.exception;

/**
 * General Application Exception class.
 *
 * @author kiruxaker
 * @version 1.0
 *
 * @see Exception
 */
public class AppException extends Exception {

    public AppException(String message) {
        super(message);
    }
}
