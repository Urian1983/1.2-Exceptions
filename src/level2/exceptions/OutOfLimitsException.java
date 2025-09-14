package level2.exceptions;

public class OutOfLimitsException extends Exception{
    public OutOfLimitsException() {
        super("Value out of range");
    }
}
