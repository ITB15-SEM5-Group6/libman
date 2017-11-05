package at.fhv.itb.sem5.team6.libman.client;

import at.fhv.itb.sem5.team6.libman.shared.interfaces.ILibraryFactory;

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
            ILibraryFactory stub = (ILibraryFactory) registry.lookup("LibraryFactory");
            stub.create().findAllMedia().forEach(System.out::println);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }

    }

}
