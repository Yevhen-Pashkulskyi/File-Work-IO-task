package v1_0_1.exception.custom;

public class NumberException extends RuntimeException {
    public NumberException(String msg,Throwable cause) {
        super(msg,cause);
    }
}
