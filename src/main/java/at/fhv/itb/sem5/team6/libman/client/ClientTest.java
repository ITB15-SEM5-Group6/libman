package at.fhv.itb.sem5.team6.libman.client;

import at.fhv.itb.sem5.team6.libman.server.model.Availability;
import at.fhv.itb.sem5.team6.libman.shared.interfaces.ILibrary;
import at.fhv.itb.sem5.team6.libman.shared.interfaces.ILibraryFactory;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientTest {

    static String host = "localhost";
    static int port = 1099;

    public static void main(String[] args) throws RemoteException, NotBoundException {

        Registry registry = LocateRegistry.getRegistry(host, port);
        ILibraryFactory stubFactory = (ILibraryFactory) registry.lookup("LibraryFactory");
        ILibrary stub = stubFactory.create();

        stub.findAllMedia().forEach(System.out::println);


        stub.findAllMedia(Availability.AVAILABLE).forEach(System.out::println);
        //stub.findAllMedia(MediaType.BOOK).forEach(System.out::println);
        //stub.findAllMedia("feu").forEach(System.out::println);
    }
}
