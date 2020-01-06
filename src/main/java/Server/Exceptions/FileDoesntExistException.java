package Server.Exceptions;

public class FileDoesntExistException extends CustomException {
    public FileDoesntExistException(String message) {
        super(message);
    }

    public FileDoesntExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
