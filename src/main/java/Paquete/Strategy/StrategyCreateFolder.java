package Paquete.Strategy;

import Server.Exceptions.FolderAlreadyExistException;
import Server.Files.FileDAO;
import Server.User.User;

public class StrategyCreateFolder implements Strategy {
    private String _name;
    private User _user;
    private FileDAO _fileDao;

    public StrategyCreateFolder(String name, User user) {
        this._name = name;
        this._user = user;
        this._fileDao = new FileDAO();
    }

    @Override
    public void execute() throws FolderAlreadyExistException {
        this._fileDao.createFolder(_name, this._user);
    }
}