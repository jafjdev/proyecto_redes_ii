package Server.Files;

import Server.Exceptions.FileDoesntExistException;
import Server.Exceptions.FolderAlreadyExistException;
import Server.Exceptions.FolderDoesntExistException;


public interface IFileManager {
    void createFolder(String name) throws FolderAlreadyExistException;

    void deleteFolder(String name) throws FolderDoesntExistException;

    void uploadFile();

    void deleteFile(String url) throws FileDoesntExistException;

    void downloadFile(String url);
}
