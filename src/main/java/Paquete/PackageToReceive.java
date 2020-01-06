package Paquete;

public class PackageToReceive extends AbstractPackage {
    private String _folderName;
    public PackageToReceive(int _code) {
        super(_code);
    }

    public PackageToReceive(int _code, String _folderName) {
        super(_code);
        this._folderName = _folderName;
    }

    public String get_folderName() {
        return _folderName;
    }

    public void set_folderName(String _folderName) {
        this._folderName = _folderName;
    }
}
