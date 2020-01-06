package Server.Files;

import Server.Config.Registry;
import Server.Exceptions.FileDoesntExistException;
import Server.Exceptions.FolderAlreadyExistException;
import Server.Exceptions.FolderDoesntExistException;
import Server.User.User;

import java.util.ArrayList;
import java.util.List;

public class FileDAO implements IFileManager {
    private Registry _registry;
    private List<Folder> _folderList;

    public FileDAO() {
        this._registry = Registry.getInstance();
        this._folderList = new ArrayList<>();
    }

    @Override
    public Folder createFolder(String name, User user) throws FolderAlreadyExistException {
        return _folderList.stream().filter(folderX -> folderX.get_name().equals(name))
                .findFirst()
                .orElseThrow(FolderAlreadyExistException::new);
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
}
