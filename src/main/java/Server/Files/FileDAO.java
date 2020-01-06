package Server.Files;

import Server.Config.Registry;
import Server.Exceptions.FileDoesntExistException;
import Server.Exceptions.FolderAlreadyExistException;
import Server.Exceptions.FolderDoesntExistException;
import Server.User.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileDAO implements IFileManager, Serializable {
    private Registry _registry;
    private List<Folder> _folderList;
    private static FileDAO _fileDAO;

    public static FileDAO getInstance() {
        if (_fileDAO == null)
            return new FileDAO();
        return _fileDAO;
    }

    public FileDAO() {
        this._registry = Registry.getInstance();
        this._folderList = new ArrayList<>();
    }

    @Override
    public void createFolder(String name, User user) throws FolderAlreadyExistException {
        if (getByFolderName(name.toLowerCase()).isPresent())
            throw new FolderAlreadyExistException();
        else
            this._folderList.add(new Folder(name, user.get_uuid()));
    }

    public Optional<Folder> getByFolderName(String name) {
        return this._folderList.stream()
                .filter(folder -> folder.get_name().equals(name))
                .findFirst();
    }

    @Override
    public void deleteFolder(String name) throws FolderDoesntExistException {

    }

    @Override
    public void uploadFile() {

    }

    @Override
    public void deleteFile(String url) throws FileDoesntExistException {

    }

    @Override
    public void downloadFile(String url) {

    }

    public List<Folder> get_folderList() {
        return _folderList;
    }

    @Override
    public String toString() {
        return "FileDAO{" +
                "_registry=" + _registry +
                ", _folderList=" + _folderList +
                '}';
    }
}
