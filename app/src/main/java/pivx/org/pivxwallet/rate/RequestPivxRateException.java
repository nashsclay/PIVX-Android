package pivx.org.pivxwallet.rate;

/**
 * Created by furszy on 7/5/17.
 */
public class RequestElectraRateException extends Exception {
    public RequestElectraRateException(String message) {
        super(message);
    }

    public RequestElectraRateException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestElectraRateException(Exception e) {
        super(e);
    }
}
