package Server.User;

import java.util.UUID;

public class User {
    private UUID _uuid;
    private String _name;
    private String _lastName;
    private String _user;
    private String _password;

    public User() {
    }

    public User(UUID _uuid, String _name, String _lastName, String _user, String _password) {
        this._uuid = _uuid;
        this._name = _name;
        this._lastName = _lastName;
        this._user = _user;
        this._password = _password;
    }

    public User(String _name, String _lastName, String _user, String _password) {
        this._uuid = UUID.randomUUID();
        this._name = _name;
        this._lastName = _lastName;
        this._user = _user;
        this._password = _password;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public String get_user() {
        return _user;
    }

    public void set_user(String _user) {
        this._user = _user;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public UUID get_uuid() {
        return _uuid;
    }

    public void set_uuid(UUID _uuid) {
        this._uuid = _uuid;
    }
}
