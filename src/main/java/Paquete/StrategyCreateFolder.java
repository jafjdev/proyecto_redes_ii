package Paquete;

import Server.Exceptions.FolderAlreadyExistException;
import Server.Files.File;
import Server.Files.FileDAO;
import Server.Files.Folder;
import Server.User.User;

public class StrategyCreateFolder implements Strategy {
    private Folder _folder;
    private User _user;
    private FileDAO _fileDao;

    public StrategyCreateFolder(Folder folder, User user) {
        this._folder = folder;
        this._user = user;
        this._fileDao = new FileDAO();
    }

    @Override
    public void execute() throws FolderAlreadyExistException {
        this._fileDao.createFolder(this._folder, this._user);
    }
}