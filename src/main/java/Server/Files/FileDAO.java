package Server.Files;

import Server.Config.Registry;
import Server.Exceptions.FileDoesntExistException;
import Server.Exceptions.FolderAlreadyExistException;
import Server.Exceptions.FolderDoesntExistException;

import java.io.File;

public class FileDAO implements IFileManager {
    private Registry _registry;

    public FileDAO() {
        this._registry = Registry.getInstance();
    }

    @Override
    public void createFolder(String name) throws FolderAlreadyExistException {
        if (!new File(this._registry.FOLDER + name).mkdir())
            throw new FolderAlreadyExistException("Esta carpeta  ya existe");

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
