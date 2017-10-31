package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaReservationFactory;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

    public static void main(String[] args) {
        new RMIServer(1099);
    }

    public RMIServer(int port) {

        try {
            LocateRegistry.createRegistry(port);

            // TODO: bind every factory, see below

            IMediaReservationFactory obj = new MediaReservationFactoryImpl();
            Naming.rebind("MediaReservationFactory", obj);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
