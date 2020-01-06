package Server.Config;

public class Registry {
    private static Registry _registry;
    public final String FOLDER = "C:\\Directory2\\";

    public static Registry getInstance() {
        if (_registry == null)
            return new Registry();
        else
            return _registry;
    }
}
