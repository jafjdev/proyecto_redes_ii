package Server.Config;

import java.io.Serializable;

public class Registry implements Serializable {
    private static Registry _registry;
    public final String FOLDER = "C:\\Directory2\\";

    public static Registry getInstance() {
        if (_registry == null)
            return new Registry();
        return _registry;
    }
}
