package Paquete.Strategy;

import Server.Files.FileDAO;

import java.io.Serializable;
public abstract class Strategy implements Serializable {
    protected FileDAO fileDAO;

    public void setFileDAO(FileDAO fileDAO) {
        this.fileDAO = fileDAO;
    }

    public abstract void execute() throws Exception;
}
