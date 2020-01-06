package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    private Serializable _package;

    public Server() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                Socket socket = serverSocket.accept();
                InputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                OutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());


                socket.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
