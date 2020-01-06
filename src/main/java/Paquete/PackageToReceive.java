package Paquete;

import Server.Files.Folder;
import Server.User.User;

public class PackageToReceive extends AbstractPackage {

    private Folder _folder;
    private User _user;

    public PackageToReceive(int _code) {
        super(_code);
    }

    public PackageToReceive(int _code, Folder _folder, User _user) {
        super(_code);
        this._folder = _folder;
        this._user = _user;
    }

    public Folder get_folder() {
        return _folder;
    }

    public void set_folder(Folder _folder) {
        this._folder = _folder;
    }

    public User get_user() {
        return _user;
    }

    public void set_user(User _user) {
        this._user = _user;
    }

}
