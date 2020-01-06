package Server.Files;

public class File {
    private String _name;
    private String _url;
    private long _size;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_url() {
        return _url;
    }

    public void set_url(String _url) {
        this._url = _url;
    }

    public long get_size() {
        return _size;
    }

    public void set_size(long _size) {
        this._size = _size;
    }
}
