package Server.User;

import java.util.UUID;

public class User {
    private UUID _uuid;
    private String _name;
    private String _lastName;
    private String _user;
    private String _password;
    private int _capacity;

    public User() {
    }

    public User(UUID uuid, String name, String lastName, String user, String password, int capacity) {
        this._uuid = uuid;
        this._name = name;
        this._lastName = lastName;
        this._user = user;
        this._password = password;
        this._capacity = capacity;
    }

    public User(String name, String lastName, String user, String password, int capacity) {
        this._uuid = UUID.randomUUID();
        this._name = name;
        this._lastName = lastName;
        this._user = user;
        this._password = password;
        this._capacity = capacity;
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
