package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.server.application.LibraryController;
import at.fhv.itb.sem5.team6.libman.server.model.*;
import at.fhv.itb.sem5.team6.libman.shared.interfaces.ILibrary;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class LibraryImpl extends UnicastRemoteObject implements ILibrary {

    private final LibraryController libraryController;

    protected LibraryImpl(LibraryController libraryController) throws RemoteException {
        this.libraryController = libraryController;
    }

    protected LibraryImpl(int port, LibraryController libraryController) throws RemoteException {
        super(port);
        this.libraryController = libraryController;
    }

    protected LibraryImpl(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf, LibraryController libraryController) throws RemoteException {
        super(port, csf, ssf);
        this.libraryController = libraryController;
    }

    @Override
    public void hello() throws RemoteException {
        System.out.println("hello");
    }

    @Override
    public List<Media> findAllMedia() throws RemoteException {
        return libraryController.findAllMedia();
    }

    @Override
    public Reservation reserveMedia(Media media, Customer customer) throws RemoteException {
        return null;
    }

    @Override
    public void cancelReservation(Reservation reservation) throws RemoteException {

    }

    @Override
    public Media findOneMedia(Serializable id) throws RemoteException {
        return null;
    }

    @Override
    public List<Media> findAllMedia(String text) throws RemoteException {
        return null;
    }

    @Override
    public List<Media> findAllMedia(MediaType type) throws RemoteException {
        return null;
    }

    @Override
    public List<Media> findAllMedia(Availability availability) throws RemoteException {
        return null;
    }

    @Override
    public List<Media> findAllMedia(String text, MediaType type, Availability availability) throws RemoteException {
        return null;
    }

    @Override
    public Lending lendPhysicalMedia(PhysicalMedia physicalMedia, Customer customer) throws RemoteException {
        return null;
    }

    @Override
    public void returnPhysicalMedia(Lending lending) throws RemoteException {

    }

    @Override
    public void extendLending(Lending lending) throws RemoteException {

    }
}
