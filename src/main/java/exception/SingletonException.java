package exception;

public class SingletonException extends NullPointerException {
    public SingletonException(String msg){
        super(msg);
    }
}