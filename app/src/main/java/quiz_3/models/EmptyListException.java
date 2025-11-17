package quiz_3.models;

public class EmptyListException extends Exception{
    public EmptyListException(String message) {
        super("From Empy List Exception: " + message);
    }
}
