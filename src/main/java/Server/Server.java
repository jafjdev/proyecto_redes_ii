package Server;

import Paquete.PackageToReceive;
import Server.Exceptions.FolderAlreadyExistException;
import Server.Files.FileDAO;
import Server.Files.IFileManager;
import Server.User.IUserManager;
import Server.User.UserDAO;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    IUserManager userManager;
    IFileManager fileManager;

    public Server() {
        Thread thread = new Thread(this);
        thread.start();
        userManager = new UserDAO();
        fileManager = new FileDAO();
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                Socket socket = serverSocket.accept();
                //////////////////////////////////////////////////////////////////
                /////                   INPUT                              /////
                //////////////////////////////////////////////////////////////////
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                PackageToReceive _packageToReceive = (PackageToReceive) objectInputStream.readObject();
                if (_packageToReceive.get_code() == 0)
                    fileManager.createFolder(_packageToReceive.get_folder(), _packageToReceive.get_user());

                //////////////////////////////////////////////////////////////////
                /////                   OUTPUT                              /////
                //////////////////////////////////////////////////////////////////
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

                socket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (FolderAlreadyExistException e) {
            e.printStackTrace();
        }

    }
}
