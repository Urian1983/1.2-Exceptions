package level1.exceptions;

public class VoidSaleException extends Exception{
    public VoidSaleException() {
        super("For selling you need to add products first");
    }
}
