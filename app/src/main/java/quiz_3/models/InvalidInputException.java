package quiz_3.models;

public class InvalidInputException extends Exception{
    public InvalidInputException(String message) {
        super("From Invalid Input Exception: " + message);
    }
}
