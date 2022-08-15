package Two;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {}
    public WrongLoginException(String massage){
        super(massage);
    }
}
