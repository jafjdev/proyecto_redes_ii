package Server.Exceptions;

public class FolderAlreadyExistException extends CustomException {
    public FolderAlreadyExistException() {
        super("Carpeta ya existente");
    }

    public FolderAlreadyExistException(String message) {
        super(message);
    }

    public FolderAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
