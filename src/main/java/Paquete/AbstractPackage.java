package Paquete;

import java.io.Serializable;

public abstract class AbstractPackage implements Serializable {
    protected int _code;

    public AbstractPackage(int _code) {
        this._code = _code;
    }

    public int get_code() {
        return _code;
    }

    public void set_code(int _code) {
        this._code = _code;
    }
}
