package Server.Exceptions;

public class FolderDoesntExistException extends CustomException {
    public FolderDoesntExistException(String message) {
        super(message);
    }

    public FolderDoesntExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
