package Paquete.Strategy;

import Server.User.User;

public class StrategyCreateFolder extends Strategy {
    private String _name;
    private User _user;

    public StrategyCreateFolder(String name, User user) {
        this._name = name;
        this._user = user;
    }

    @Override
    public void execute() throws Exception {
        this.fileDAO.createFolder(_name, this._user);

    }
}