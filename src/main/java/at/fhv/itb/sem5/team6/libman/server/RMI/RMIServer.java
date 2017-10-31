package at.fhv.itb.sem5.team6.libman.server.RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

    public RMIServer(int port) {

        try {
            LocateRegistry.createRegistry(port);

            // TODO: bind every factory, see below

            //ATMFactory obj = new ATMFactoryImpl();
            //Naming.rebind("ATMFactory", obj);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
