package Paquete;

import Paquete.Strategy.Strategy;

public class PackageToSend extends AbstractPackage {
	
    public PackageToSend(int _code) {
        super(_code);
    }
    
    public PackageToSend(Strategy strategy) {
    	super(strategy);
    }
}
