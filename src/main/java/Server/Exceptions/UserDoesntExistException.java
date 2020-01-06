package Server.Exceptions;

public class UserDoesntExistException extends CustomException {

    public UserDoesntExistException(String message) {
        super(message);
    }

    public UserDoesntExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
