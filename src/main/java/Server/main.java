package Server;

import Server.Config.Registry;
import Server.Exceptions.FolderAlreadyExistException;
import Server.Files.FileDAO;
import Server.Files.IFileManager;
public class main {
    public static void main(String[] args) {
        Registry registry = Registry.getInstance();
        IFileManager fileManager = new FileDAO();
        try {
            fileManager.createFolder("Pepito");
        } catch (FolderAlreadyExistException e) {
            e.printStackTrace();
        }
    }
}
