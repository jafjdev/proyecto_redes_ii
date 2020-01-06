package Paquete;

import Paquete.Strategy.Strategy;
import Server.User.User;

import java.io.Serializable;

public abstract class AbstractPackage implements Serializable {
    protected int _code;
    protected User user;
    protected Strategy strategy;

    public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public AbstractPackage(int _code) {
        this._code = _code;
    }

    public int get_code() {
        return _code;
    }

    public void set_code(int _code) {
        this._code = _code;
    }

    public AbstractPackage(Strategy strategy) {
    	this.strategy = strategy;
    }
}
