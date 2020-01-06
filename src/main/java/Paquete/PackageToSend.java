package Paquete;

import Client.Strategy;

public class PackageToSend extends AbstractPackage {
	
    public PackageToSend(int _code) {
        super(_code);
    }
    
    public PackageToSend(Strategy strategy) {
    	super(strategy);
    }
}
