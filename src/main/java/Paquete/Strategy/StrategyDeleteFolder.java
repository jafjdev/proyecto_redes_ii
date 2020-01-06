package Paquete.Strategy;

import Server.Files.FileDAO;
import Server.User.User;

public class StrategyDeleteFolder extends Strategy {
    private FileDAO _fileDao;
    private User _user;
    private String _folderName;

    public StrategyDeleteFolder(String _folderName, User _user) {
        this._folderName = _folderName;
        this._user = _user;
        this._fileDao = FileDAO.getInstance();
    }

    @Override
    public void execute() throws Exception {

    }
}
