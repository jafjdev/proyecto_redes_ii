package Paquete;

import Server.Files.File;

public class PackageFile extends AbstractPackage {
    File file;

    public PackageFile(int _code) {
        super(_code);
    }

    public PackageFile(int _code, File file) {
        super(_code);
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
