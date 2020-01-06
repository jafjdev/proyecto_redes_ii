package Client;

import Server.User.User;

import java.util.Scanner;
import java.util.UUID;

public class Menu {
    private final String IP = "192.168.1.2"; //Change
    private final int PORT = 9999; //Change

    public void mostrar() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        Client client = new Client(IP, PORT);
        User user = new User(UUID.randomUUID(), "Manuel", "Espinoza", "maespinoza", "xyz", 2);
        while (!salir) {
            System.out.println("\n Men�:\n");
            System.out.println(" 1. Create folder");
            System.out.print("Escribe una de las opciones: ");
            opcion = sn.nextInt();
            String name;
            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la carpeta");
                    name = sn.next();
                    client.createFolder(name, user);
                    break;
            }
        }
    }
}
