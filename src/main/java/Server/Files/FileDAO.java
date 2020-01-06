package Server.Files;

import Server.Config.Registry;
import Server.Exceptions.FileDoesntExistException;
import Server.Exceptions.FolderAlreadyExistException;
import Server.Exceptions.FolderDoesntExistException;
import Server.User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileDAO implements IFileManager {
    private Registry _registry;
    private List<Folder> _folderList;

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
}
