package Server;

import Paquete.AbstractPackage;
import Paquete.PackageToSend;
import Server.Exceptions.FolderAlreadyExistException;
import Server.Files.FileDAO;
import Server.User.IUserManager;
import Server.User.UserDAO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    IUserManager userManager;
    FileDAO fileManager;

    public Server() {
        Thread thread = new Thread(this);
        thread.start();
        userManager = new UserDAO();
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                Socket socket = serverSocket.accept();
                fileManager = FileDAO.getInstance();
                //////////////////////////////////////////////////////////////////
                /////                          INPUT                         /////
                //////////////////////////////////////////////////////////////////
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                AbstractPackage _packageToReceive = (PackageToSend) objectInputStream.readObject();
                _packageToReceive.getStrategy().setFileDAO(fileManager);
                _packageToReceive.getStrategy().execute();
                System.out.println(FileDAO.getInstance().get_folderList().toString());
                //////////////////////////////////////////////////////////////////
                /////                         OUTPUT                        /////
                //////////////////////////////////////////////////////////////////
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

                socket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (FolderAlreadyExistException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
