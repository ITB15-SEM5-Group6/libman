package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaReservationFactory;
import at.fhv.itb.sem5.team6.libman.interfaces.IMediaSearchFactory;
import at.fhv.itb.sem5.team6.libman.interfaces.IPhysicalMediaFactory;
import org.springframework.context.annotation.Bean;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {

    public static void main(String[] args) {
        new RMIServer(1099);
    }

    public RMIServer(int port) {

        try {
            LocateRegistry.createRegistry(port);




            // creating and binding all Factories
            IMediaReservationFactory mediaReservationFactory = new MediaReservationFactoryImpl();
            Naming.rebind("MediaReservationFactory", UnicastRemoteObject.exportObject(mediaReservationFactory,9998));

            IMediaSearchFactory mediaSearchFactory = new MediaSearchFactoryImpl();
            Naming.rebind("MediaSearchFactory", UnicastRemoteObject.exportObject(mediaSearchFactory,9999));

            IPhysicalMediaFactory physicalMediaFactory = new PhysicalMediaFactoryImpl();
            Naming.rebind("PhysicalMediaFactory", UnicastRemoteObject.exportObject(physicalMediaFactory,10000));

            System.err.println("Server ready");

            System.in.read();

            UnicastRemoteObject.unexportObject(mediaReservationFactory, true);
            UnicastRemoteObject.unexportObject(mediaSearchFactory, true);
            UnicastRemoteObject.unexportObject(physicalMediaFactory, true);
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
