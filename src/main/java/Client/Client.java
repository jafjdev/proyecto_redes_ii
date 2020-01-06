package Client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;


import Paquete.AbstractPackage;
import Paquete.PackageToSend;
import Paquete.Strategy.Strategy;
import Paquete.Strategy.StrategyCreateFolder;
import Server.User.User;

public class Client {
	
	private String ipServer;
	private int portServer;
	
	
    public Client(String ipServer, int portServer) {
		this.ipServer = ipServer;
		this.portServer = portServer;
	}

	public void createFolder(String name, User user) {
       Strategy strategy = new StrategyCreateFolder(name,user);
       AbstractPackage packageToSend = new PackageToSend(strategy);
       socketEnviar(packageToSend, ipServer, portServer);
    }

   
    public void deleteFolder(String name) {

    }

 
    public void uploadFile() {

    }


    public void deleteFile(String url)  {

    }

    public void downloadFile(String url) {

    }

	private void socketEnviar(AbstractPackage packageToSend,String ipServer, int portServer) {
        try {
            Socket socket = new Socket(ipServer,portServer);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(packageToSend);
            socket.close();
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
