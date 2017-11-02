package at.fhv.itb.sem5.team6.libman.client;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaReservation;
import at.fhv.itb.sem5.team6.libman.interfaces.IMediaReservationFactory;
import at.fhv.itb.sem5.team6.libman.server.model.Customer;
import at.fhv.itb.sem5.team6.libman.server.model.Media;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Christina on 02.11.2017.
 */
public class ClientTest {

    static String host = "localhost";
    static int port = 1099;

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(host,port);


            IMediaReservationFactory stub = (IMediaReservationFactory) registry.lookup("MediaReservationFactory");

            IMediaReservation mediaReservation = stub.create();

            mediaReservation.reserve(new Media(),new Customer());

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }

    }

}
