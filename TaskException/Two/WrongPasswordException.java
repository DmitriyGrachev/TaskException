package Two;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException() {}
    public WrongPasswordException(String massage){
        super(massage);
    }

}
