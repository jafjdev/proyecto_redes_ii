package Server.Files;

import java.util.UUID;

public class Folder {
    private String _name;
    private File _file;
    private UUID _userUUID;

    public Folder(String _name) {
        this._name = _name;
    }

    public Folder(String _name, UUID _userUUID) {
        this._name = _name;
        this._userUUID = _userUUID;
    }

    public Folder(String _name, UUID _userUUID, File _file) {
        this._name = _name;
        this._file = _file;
        this._userUUID = _userUUID;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public File get_file() {
        return _file;
    }

    public void set_file(File _file) {
        this._file = _file;
    }

    public UUID get_userUUID() {
        return _userUUID;
    }

    public void set_userUUID(UUID _userUUID) {
        this._userUUID = _userUUID;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "_name='" + _name + '\'' +
                ", _file=" + _file +
                ", _userUUID=" + _userUUID +
                '}';
    }
}
