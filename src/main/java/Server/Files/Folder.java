package Server.Files;

public class Folder {
    private String _name;
    private File _file;

    public Folder(String _name) {
        this._name = _name;
    }

    public Folder(String _name, File _file) {
        this._name = _name;
        this._file = _file;
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
}
